import java.util.*;

public class Main {
    public static int MAX_N = 100;
    public static int[] bomb = new int[MAX_N];
    public static int n, k;
    
    public static boolean isTrue(int x) {
        boolean isBoom = false;

        for(int i = 0; i < n; i ++) {
            if(i == x) continue;
            if(bomb[i] == bomb[x] && Math.abs(i - x) <= 3) isBoom = true; 
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

        int ans = 0;
        int[] boom = new int[MAX_N];

        for(int i = 0; i < n; i ++) {
            if(isTrue(i)) {
                boom[bomb[i]] ++;
            }
        }

        for(int i = 0; i < MAX_N; i ++) {
            if(boom[i] >= ans) ans = i;
        }

        System.out.println(ans);
    }
}