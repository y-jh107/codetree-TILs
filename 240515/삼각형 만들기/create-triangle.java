import java.util.*;

public class Main {
    public static final int MAX_INT = Integer.MAX_VALUE;
    public static int n;

    public static boolean isTrue(int[][] points, int i1, int i2, int i3) {
        if(points[i1][0] == points[i2][0] || points[i1][0] == points[i3][0] || points[i2][0] == points[i3][0]) 
            if(points[i1][1] == points[i2][1] || points[i1][1] == points[i3][1] || points[i2][1] == points[i3][1])
                return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] points = new int[n][2];
        int maxValue = 0;

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < 2; j ++) {
                points[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i ++) {
            for(int j = i + 1; j < n; j ++) {
                for(int k = j + 1; k < n; k ++) {
                    if(isTrue(points, i, j, k)) {
                        int x1 = points[i][0], y1 = points[i][1];
                        int x2 = points[j][0], y2 = points[j][1];
                        int x3 = points[k][0], y3 = points[k][1];

                        //System.out.println(x1 + " " + x2 + " " + x3);

                        int result = Math.abs((x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3));

                        //result /= 2;

                        //System.out.println(result);

                        maxValue = Math.max(maxValue, result);
                    }
                }
            }
        }

        System.out.println(maxValue);
    }
}