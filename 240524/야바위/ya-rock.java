import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), maxScore = 0;

        int[] yabawi = new int[4];
        int[] ans = new int[n];
        int[][] changes = new int[n][2];

        for(int i = 0; i < n; i ++) {
            changes[i][0] = sc.nextInt();
            changes[i][1] = sc.nextInt();

            ans[i] = sc.nextInt();
        }

        for(int i = 1; i <= 3; i ++) {
            int cnt = 0, times = n, idx = 0;
            yabawi[i] = 1;

            while(times -- > 0) {
                int tmp;
                
                tmp = yabawi[changes[idx][0]];
                yabawi[changes[idx][0]] = yabawi[changes[idx][1]];
                yabawi[changes[idx][1]] = tmp;
                //System.out.println();

                if(yabawi[ans[idx]] == 1) {
                    //System.out.println(i + " " + ans[idx]);
                    cnt ++;
                }

                idx ++;
            }

            maxScore = Math.max(maxScore, cnt);
            for(int j = 1; j <= n; j ++) {
                yabawi[j] = 0;
            }
        }

        System.out.println(maxScore);
    }
}