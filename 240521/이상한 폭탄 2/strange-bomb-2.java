import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();

        int[] bomb = new int[n];
        for(int i = 0; i < n; i ++) {
            bomb[i] = sc.nextInt();
        }


        int ans = -1;
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j ++) {
                if(i == j) continue;
                if(bomb[i] == bomb[j] && Math.abs(i - j) <= d) {
                    ans = Math.max(ans, bomb[i]);
                } 
            } 
        }

        System.out.println(ans);
    }
}