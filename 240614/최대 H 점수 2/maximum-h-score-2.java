import java.util.*;

public class Main {
    public static int MAX_N = 100;
    public static int n, l;

    public static int[] arr =  new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        l = sc.nextInt();

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;

        for(int i = 0; i <= MAX_N; i ++) {
            int cnt = 0, maxVal = 0;

            for(int j = 0; j < n; j ++) {
                for(int k = 0; k < l; k ++) {
                    arr[j] += 1;
                }

                if(arr[j] >= i) {
                    cnt ++;
                    maxVal = Math.max(maxVal, arr[j]);
                }
            }

            if(cnt >= i)
                ans = Math.max(ans, i);
        }

        System.out.println(ans);
    }
}