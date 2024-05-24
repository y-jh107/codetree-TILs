import java.util.*;

public class Main {
    public static int MAX_N = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = MAX_N;

        int[] arr = new int[n];

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i ++) {
            arr[i] *= 2;

            for(int j = 0; j < n; j ++) {
                int[] remainingArr = new int[n - 1];
                int idx = 0;

                for(int k = 0; k < n; k ++) {
                    if(k != j) 
                        remainingArr[idx ++] = arr[k];
                }

                int sumDiff = 0;

                for(int k = 0; k < idx - 1; k ++) {
                    sumDiff += Math.abs(remainingArr[k + 1] - remainingArr[k]);
                }

                ans = Math.min(ans, sumDiff);
            }

            arr[i] /= 2;
        }

        System.out.println(ans);
    }
}