import java.util.*;

public class Main {
    public static int MAX_N = 100;
    public static int MAX_BOMB = 1000000;
    public static int[] bomb = new int[MAX_N];
    public static int n, k;
    
    public static boolean isTrue(int x) {
        boolean isBoom = false;

        for(int i = 0; i < n; i ++) {
            if(i == x) continue;
            if(bomb[i] == bomb[x] && Math.abs(i - x) <= k) isBoom = true; 
        }

        return isBoom;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        for(int i = 0; i < n; i ++) {
            bomb[i] = sc.nextInt();
        }

        int ans = 0, boomed = -1;
        int[] boom = new int[MAX_BOMB];

        for(int i = 0; i < n; i ++) {
            if(isTrue(i)) {
                boom[bomb[i]] ++;
            }
        }

        for(int i = 0; i < MAX_BOMB; i ++) {
            //System.out.print(boom[i] + " ");
            if(boom[i] >= boomed && boom[i] != 0) {
                //System.out.println(ans);
                ans = i;
                boomed = boom[i];
            }
        }

        System.out.println(ans);
    }
}