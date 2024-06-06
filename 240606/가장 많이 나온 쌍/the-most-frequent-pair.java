import java.util.*;

public class Main {
    public static int MAX_N = 10;
    public static int MAX_M = 100;

    public static int[] a = new int[MAX_M + 1];
    public static int[] b = new int[MAX_M + 1];

    public static int countSame(int x) {
        int cnt = 0, num1 = a[x], num2 = b[x];

        for(int i = 0; i < MAX_M; i ++) {
            if(i == x) continue;

            if((a[i] == num1 && b[i] == num2) || (a[i] == num2 && b[i] == num1))
                cnt ++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int ans = 0;
        
        for(int i = 0; i < m; i ++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i ++) {
            int cnt = countSame(i) + 1;

            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}