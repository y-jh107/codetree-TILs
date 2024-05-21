import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), n = sc.nextInt();
        int[][] game = new int[k][n];
        int[][] wins = new int[n + 1][n + 1];

        for(int i = 0; i < k; i ++) {
            for(int j = 0; j < n; j ++) {
                game[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for(int i = 0; i < k; i ++) {
            for(int j = 0; j < n; j ++) {
                for(int l = j + 1; l < n; l ++) {
                    wins[game[i][j]][game[i][l]] ++;
                }
            }
        }

        for(int i = 1; i <= n; i ++) {
            for(int j = 1; j <= n; j ++) {
                if(wins[i][j] == k) ans ++;
            }
        }

        System.out.println(ans);
    }
}