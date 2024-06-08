import java.util.*;

public class Main {
    public static int MAX_N = 100;
    public static int[] rocks = new int[MAX_N + 1];
    public static int n, k;

    public static boolean isPossible(int maxVal) {
        int[] available = new int[MAX_N + 1];
        int cnt = 0;

        for(int i = 0; i < n; i ++) {
            if(rocks[i] <= maxVal)
                available[cnt ++] = i;
        }

        for(int i = 1; i < cnt; i ++) {
            int dist = available[i] - available[i - 1];
            if(dist > k)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        int maxVal = 0;
        for(int i = 0; i < n; i ++) {
            rocks[i] = sc.nextInt();
            if(rocks[i] > maxVal) maxVal = rocks[i];
        }
        
        int ans = MAX_N;
        for(int i = Math.max(rocks[0], rocks[n - 1]); i < MAX_N; i ++) {
            if(isPossible(i))
                ans = Math.min(ans, i);
        }

        System.out.println(ans);
    }
}