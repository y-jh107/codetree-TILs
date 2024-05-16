import java.util.*;

public class Main {
    public static final int MAX_N = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans = 0;
        int[][] working = new int[n][2];

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < 2; j ++) {
                working[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i ++) {
            int[] counting = new int[1000];

            for(int j = 0; j < n; j ++) {
                if(j == i) continue;

                int start = working[j][0], end = working[j][1], cnt = 0;

                for(int k = start; k < end; k ++) {
                    counting[k] ++;
                }

                for(int k = 0; k < 1000; k ++) {
                    if(counting[k] != 0) cnt ++;
                }

                ans = Math.max(ans, cnt);
            }
        }

        System.out.println(ans);
    }
}