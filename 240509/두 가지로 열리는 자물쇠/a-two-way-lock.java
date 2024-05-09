import java.util.*;

public class Main {
    public static int n;

    public static int getDiff(int a, int b) {
        if(a == n && b <= 2) {
            a = 0;
        }
        else if(b == n && a <= 2) {
            b = 0;
        }

        if(a == n - 1 && b < 2) {
            a = -1;
        }
        else if(b == n - 1 && a < 2) {
            b = -1;
        }

        return Math.abs(a - b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int cnt = 0;
        int a1 = sc.nextInt(), b1 = sc.nextInt(), c1 = sc.nextInt();
        int a2 = sc.nextInt(), b2 = sc.nextInt(), c2 = sc.nextInt();

        for(int i = 1; i <= n; i ++) {
            for(int j = 1; j <= n; j ++) {
                for(int k = 1; k <= n; k ++) {
                    if(getDiff(i, a1) <= 2 && getDiff(j, b1) <= 2 && getDiff(k, c1) <= 2) {
                        //System.out.println(i + " " + j + " " + k);
                        cnt ++;
                    }
                    else if(getDiff(i, a2) <= 2 && getDiff(j, b2) <= 2 && getDiff(k, c2) <= 2) {
                        //System.out.println(i + " " + j + " " + k);
                        cnt ++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}