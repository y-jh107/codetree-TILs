import java.util.*;

public class Main {
    public static final int MAX_INT = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), minValue = MAX_INT;
        int[][] points = new int[n][2];

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < 2; j ++) {
                points[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i ++) {
            for(int j = i + 1; j < n; j ++) {
                int x1 = points[i][0], x2 = points[j][0], y1 = points[i][1], y2 = points[j][1];

                int dis = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);

                minValue = Math.min(minValue, dis);
            }
        }

        System.out.println(minValue);
    }
}