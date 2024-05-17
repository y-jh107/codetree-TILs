import java.util.*;

public class Main {
    public static int n;

    public static boolean isCrossed(int[] start, int[] end, int i, int j) {
        if(start[i] < start[j] && end[i] > end[j])
            return true;
        else if(start[i] > start[j] && end[i] < end[j])
            return true;
        else if(start[i] < start[j] && end[i] > end[j])
            return true;
        else 
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        int[] check = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i ++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i ++) {
            int crossed = 0;
            for(int j = i + 1; j < n; j ++) {
                if(isCrossed(start, end, i, j)) {
                    check[i] ++;
                    check[j] ++;
                    crossed ++;
                }
            }

            if(crossed == 0 && check[i] == 0) {
                //System.out.println(start[i] + " " + end[i]);
                cnt ++;
            }
        }

        System.out.println(cnt);
    }
}