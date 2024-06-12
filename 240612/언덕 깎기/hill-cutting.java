import java.util.*;

public class Main {
    public static int MAX_N = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] hill = new int[n];

        for(int i = 0; i < n; i ++) {
            hill[i] = sc.nextInt();
        }

        Arrays.sort(hill);

        int ans = 0;
        int topIdx = 0, botIdx = 0;
        for(int i = 0; i < n / 2; i ++) {
            if(hill[n - i - 1] - hill[i] <= 17) {
                topIdx = n - i - 1;
                botIdx = i;
                break;
            }
        }

        for(int i = 0; i < n; i ++) {
            if(hill[i] < hill[botIdx]) {
                ans += (hill[botIdx] - hill[i]) * (hill[botIdx] - hill[i]);
            }
            else if(hill[i] > hill[topIdx]) {
                ans += (hill[i] - hill[topIdx]) * (hill[i] - hill[topIdx]);
            }
        }

        System.out.println(ans);
    }
}