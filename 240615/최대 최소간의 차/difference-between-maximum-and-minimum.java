import java.util.*;

public class Main {
    public static int MAX_N = 100;
    public static int MAX_K = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;

        for(int i = 1; i <= MAX_K; i ++) {
            int cost = 0;
            int minVal = i, maxVal = i + k;

            for(int j = 0; j < n; j ++) {
                if(arr[j] > maxVal) cost += Math.abs(arr[j] - maxVal);
                else if(arr[j] < minVal) cost += Math.abs(minVal - arr[j]);
            }

            ans = Math.min(ans, cost);
        }

        System.out.println(ans);
    }
}