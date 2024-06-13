import java.util.*;

public class Main {
    public static int MAX_N = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++)
            arr[i] = sc.nextInt();

        int ans = 0;//Integer.MAX_VALUE;

        for(int i = 1; i <= MAX_N * MAX_N; i ++) {
            int sum = 0, max = 0;
            int section = 0;
            boolean possible = true;

            for(int j = 0; j < n; j ++) {
                if(arr[j] > i) {
                    possible = false;
                    break;
                }

                sum += arr[j];

                if(sum > i) {
                    sum -= arr[j];
                    if(sum > max) max = sum;

                    section ++;
                    sum = arr[j];
                }
            }

            if(possible) {
                if(section <= m - 1) {
                    ans = Math.max(ans, i);
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}