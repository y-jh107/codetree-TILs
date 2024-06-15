import java.util.*;

public class Main {
    public static int MAX_N = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++)
            arr[i] = sc.nextInt();

        int ans = Integer.MAX_VALUE;

        for(int i = 0; i <= k; i ++) {
            int gap = i, cost = 0;
            int maxVal = arr[0], minVal = arr[0] - gap;

            for(int j = 0; j < n; j ++) {
                if(arr[j] >= maxVal) {
                    cost += Math.abs(arr[j] - maxVal);
                    //System.out.println(cost);
                }
                else if(arr[j] <= minVal) {
                    cost += Math.abs(arr[j] - minVal);
                    //System.out.println(cost);
                }
            }

            ans = Math.min(ans, cost);
        }

        System.out.println(ans);
    }
}