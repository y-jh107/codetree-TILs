import java.util.*;

public class Main {
    public static int MAX_N = 100;
    public static int[][] line = new int[MAX_N + 1][2];

    public static boolean isTrue(int x1, int x2, int x3, int x4) {
        if(x2 < x3 || x1 > x4) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), longest = 0;
        
        for(int i = 0; i < n; i ++) {
            line[i][0] = sc.nextInt();
            line[i][1] = sc.nextInt();

            int dis = line[i][1] - line[i][0];

            if(dis > longest) longest = i;
        }

        int x3 = line[longest][0], x4 = line[longest][1];
        boolean isColapse = true;
        for(int i = 0; i < n; i ++) {
            if(i == longest) continue;

            if(!isTrue(line[i][0], line[i][1], x3, x4)) {
                isColapse = false;
                System.out.println("No");
                break;
            }
        }

        if(isColapse) System.out.println("Yes");
    }
}