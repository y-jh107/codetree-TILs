import java.util.*;

public class Main {
    public static int N;
    public static final int MAX_INT = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int ans = MAX_INT;
        int[][] point = new int[N][2];

        for(int i = 0; i < N; i ++) {
            for(int j = 0; j < 2; j ++) {
                point[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i ++) {
            int[] square = new int[160000001];

            for(int j = 0; j < N; j ++) {
                if(i == j) continue;

                int minX = MAX_INT, minY = MAX_INT,  maxX = 1, maxY = 1;
                for(int k = 0; k < N; k ++) {
                    if(k == i) continue;

                    minX = Math.min(minX, point[k][0]);
                    minY = Math.min(minY, point[k][1]);
                    maxX = Math.max(maxX, point[k][0]);
                    maxY = Math.max(maxY, point[k][1]);
                }

                int length = Math.abs(maxX - minX), width = Math.abs(maxY - minY);

                int s = length * width;

                square[s] ++;
            }

            for(int j = 0; j < 160000001; j ++) {
                if(square[j] != 0) {
                    ans = Math.min(ans, j);
                }
            }
        }

        System.out.println(ans);
    }
}