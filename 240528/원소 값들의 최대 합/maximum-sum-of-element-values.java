import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];
        int ans = 0;

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i ++) {
            int start = i, sum = 0;
            for(int j = 0; j < m; j ++) {
                sum += arr[start];
                start = arr[start] - 1;
            }

            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }
}