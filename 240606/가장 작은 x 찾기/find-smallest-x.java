import java.util.*;

public class Main {
    public static int MAX_N = 10;
    public static int MAX_A = 10000;

    public static int makeDouble(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), ans = MAX_A;
        int[][] range = new int[n][2];

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < 2; j ++) {
                range[i][j] = sc.nextInt();
            }
        }

        for(int x = 1; x <= 10000; x ++) {
            int currNum = x;
            boolean inRange = true;

            for(int t = 0; t < n; t ++) {
                if(makeDouble(currNum) < range[t][0] || makeDouble(currNum) > range[t][1]) {
                    inRange = false;
                    break;
                }
                currNum *= 2;
            }

            if(inRange) ans = Math.min(ans, x);
        }

        System.out.println(ans);
    }
}