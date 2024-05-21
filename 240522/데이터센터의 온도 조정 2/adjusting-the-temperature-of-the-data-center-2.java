import java.util.*;

public class Main {
    public static int c, g, h;
    public static int MAX_N = 1000;
    public static int[] works = new int[MAX_N];

    public static int findWork(int idx1, int idx2, int num) {
        if(num >= idx1 && num <= idx2) return g;
        if(num < idx1) return c;
        if(num > idx2) return h;

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), totalWork = 0;
        c = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();

        int[] start = new int[MAX_N];
        int[] end = new int[MAX_N];

        for(int i = 0; i < n; i ++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        for(int i = 0; i < MAX_N; i ++) {
            int total = 0;

            for(int j = 0; j < n; j ++) {
                total += findWork(start[j], end[j], i);
                //System.out.println(total);
            }
            //System.out.println();

            totalWork = Math.max(totalWork, total);
        }

        System.out.println(totalWork);
    }
}