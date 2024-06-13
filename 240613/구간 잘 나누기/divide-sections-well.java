import java.util.*;

public class Main {
    public static int MAX_N = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++)
            arr[i] = sc.nextInt();

        int ans = 0;

        for(int i = 1; i <= MAX_N * MAX_N; i ++) {
            int sum = 0;
            int max = 0;
            int mcnt = 0;

            for(int j = 0; j < n; j ++) {
                if(arr[j] > i) break;

                sum += arr[j];
                if(sum > i) {
                    sum -= arr[j];
                    if(sum > max) max = sum;

                    sum = arr[j];
                    mcnt ++;
                }
            }

            if(mcnt <= m - 1 && m == i) {
                ans = Math.max(ans, i);
            }
        }

        System.out.println(ans);
    }
}