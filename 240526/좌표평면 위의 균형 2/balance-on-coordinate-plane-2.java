import java.util.*;

public class Main {
    public static int MAX_N = 100;
    public static int n;
    public static int[] x = new int[MAX_N + 1];
    public static int[] y = new int[MAX_N + 1];

    public static int balanceLine(int xLine, int yLine) {
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;
        int maxPoints = 0;

        for(int i = 0; i < n; i ++) {
            if(x[i] < xLine && y[i] < yLine) cnt1 ++;
            else if(x[i] < xLine && y[i] > yLine) cnt2 ++;
            else if(x[i] > xLine && y[i] < yLine) cnt3 ++;
            else cnt4 ++;

            maxPoints = Math.max(maxPoints, cnt1);
            maxPoints = Math.max(maxPoints, cnt2);
            maxPoints = Math.max(maxPoints, cnt3);
            maxPoints = Math.max(maxPoints, cnt4);
        }

        return maxPoints;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int ans = MAX_N;

        for(int i = 0; i < n; i ++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for(int i = 0; i < MAX_N; i += 2) {
            for(int j = 0; j < MAX_N; j += 2) {
                int balance = balanceLine(i, j);
                ans = Math.min(ans, balance);
            }
        }
        
        System.out.println(ans);
    }
}