import java.util.*;

public class Main {
    public static int n;
    public static final int MAX_INT = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int distance = 0, minValue = MAX_INT;
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i < n; i ++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for(int i = 1; i < n - 1; i ++) {
            int startX = x[0], startY = y[0];

            for(int j = 1; j < n; j ++){
                if(j == i) continue;

                int currX = x[j], currY = y[j];
                //System.out.println(startX + " " + startY + " , " + currX + " " + currY);
                distance += Math.abs(startX - currX) + Math.abs(startY - currY);
                //System.out.println(distance);
                //System.out.println(Math.abs(startX - currX) + Math.abs(startY - currY));
                startX = currX;
                startY = currY;
                //System.out.println(startX + " " + startY);
            }
            minValue = Math.min(minValue, distance);
            distance = 0;
        }

        System.out.println(minValue);
    }
}