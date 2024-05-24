import java.util.*;

public class Main {
    public static int MAX_N = 100;

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
                int[] remainingArr = new int[4];
                int idx = 0;

                for(int k = 0; k < n; k ++) {
                    if(k != j) 
                        remainingArr[idx ++] = arr[k];
                }

                int sumDiff = 0;

                for(int k = 0; k < n - 2; k ++) {
                    sumDiff += Math.abs(remainingArr[k + 1] - remainingArr[k]);
                }

                ans = Math.min(ans, sumDiff);
            }

            arr[i] /= 2;
        }

        System.out.println(ans);
    }
}