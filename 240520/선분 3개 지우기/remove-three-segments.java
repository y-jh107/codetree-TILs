import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] line = new int[n][2];

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < 2; j ++) {
                line[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for(int i = 0; i < n; i ++) {
            for(int j = i + 1; j < n; j ++) {
                for(int k = j + 1; k < n; k ++) {
                    int[] cnt = new int[101];

                    for(int s = 0; s < n; s ++) {
                        if(s == i || s == j || s == k) continue;

                        int start = line[s][0];
                        int end = line[s][1];

                        for(int l = start; l <= end; l ++) {
                            cnt[l] ++;
                        }
                    }

                    boolean isTrue = false;

                    for(int s = 0; s < 101; s ++) {
                        if(cnt[s] > 1) {
                            isTrue = true;
                        }
                    }

                    if(!isTrue) ans ++;
                }
            }
        }

        System.out.println(ans);
    }
}