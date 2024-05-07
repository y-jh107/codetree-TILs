import java.util.*;

public class Main {
    public static int[] height = new int[101];
    public static int[] setting = new int[101];
    public static int n, t, h;

    public static int set(int x) {
        return Math.abs(x - h);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        h = sc.nextInt();
        int minValue = Integer.MAX_VALUE;

        //System.out.println(h + " " + t);

        for(int i = 0; i < n; i ++) {
            height[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i ++) {
            setting[i] = set(height[i]);
            //System.out.print(setting[i] + " ");
        }

        for(int i = 0; i < n; i ++) {
            int cnt = 0;

            for(int j = i; j < i + t; j ++) {
                //System.out.print(setting[j] + " cnt: ");
                cnt += setting[j];
                //System.out.print(cnt + " ");
            }
            //System.out.println();

            minValue = Math.min(minValue, cnt);
        }

        System.out.println(minValue);
    }
}