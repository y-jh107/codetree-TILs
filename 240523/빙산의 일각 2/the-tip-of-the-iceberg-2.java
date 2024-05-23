import java.util.*;

public class Main {
    public static int MAX_N = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans = 0, maxHeight = 0;
        int[] tip = new int[n];

        for(int i = 0; i < n; i ++) {
            tip[i] = sc.nextInt();
            maxHeight = Math.max(maxHeight, tip[i]);
        }

        for(int i = 1; i <= maxHeight; i ++) {
            int cnt = 0;
            boolean[] above = new boolean[n];

            for(int j = 0; j < n; j ++) {
                if(tip[j] <= i) {
                    above[j] = false;
                    continue;
                }
                
                above[j] = true;
            }

            for(int j = 0; j < n; j ++) {
                if(j == 0 && !above[j]) continue;
                else if(j == 0 && above[j]) cnt++;
                else if(above[j] && !above[j - 1]) cnt ++;
                else if(above[j] && above[j - 1]) continue;
                else if(!above[j]) continue;
            }

            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}