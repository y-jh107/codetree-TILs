import java.util.*;

public class Main {
    public static int[] height = new int[101];
    public static int[] setting = new int[101];
    public static int n, t, h;

    public static int set(int x) {
        int curr = x, cnt = 0;

        if(x > h) {
            while(curr != h) {
                curr --;
                cnt ++;
            }
        }
        else if(x < h) {
            while(curr != h) {
                curr ++;
                cnt ++;
            }
        }
        
        return cnt;
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
            //System.out.println(height[i] + " " + i);
            setting[i] = set(height[i]);
            //System.out.println(setting[i]);
        }

        for(int i = 0; i < n; i ++) {
            int cnt = 0;

            for(int j = i; j < i + t; j ++) {
                cnt += setting[j];
            }

            minValue = Math.min(minValue, cnt);
        }

        System.out.println(minValue);
    }
}