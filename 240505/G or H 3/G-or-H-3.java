import java.util.*;

public class Main {
    public static int n, k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] place = new int[10000];
        char[] picture = new char[10000];

        for(int i = 0; i < n; i ++) {
            int idx = sc.nextInt();
            place[idx] = 1;
            picture[idx] = sc.next().charAt(0);
        }

        int maxValue = 0;
        for(int i = 0; i < 10000 - k; i ++) {
            int sum = 0;
            for(int j = i; j <= i + k; j ++) {
                if(picture[j] == 'G') sum += 1;
                else if(picture[j] == 'H') sum += 2;
            }
            maxValue = Math.max(maxValue, sum);
        }

        System.out.println(maxValue);
    }
}