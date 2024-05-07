import java.util.*;

public class Main {
    public static int[] height = new int[101];

    public static int n, t, h;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        h = sc.nextInt();
        t = sc.nextInt();
        int minValue = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i ++) {
            height[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i ++) {
            int cnt = 0;

            for(int j = i; j < i + t; j ++) {
                cnt += Math.abs(height[j] - h);
            }

            minValue = Math.min(minValue, cnt);
        }

        System.out.println(minValue);
    }
}