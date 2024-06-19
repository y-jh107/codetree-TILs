import java.util.*;

public class Main {
    public static int MAX_N = 100;
    public static int[][] move = new int[MAX_N][2];
    public static int[] pigeon = new int[11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int crossing = 0;
        boolean[] firstAppearance = new boolean[11];

        for(int i = 0; i < n; i ++) {
            int p = sc.nextInt(), look = sc.nextInt();

            move[i][0] = p;
            move[i][1] = look;
        }

        for(int i = 0; i < n; i ++) {
            int p = move[i][0];
            int look = move[i][1];

            if(!firstAppearance[p]) {
                firstAppearance[p] = true;
                pigeon[p] = look;
            }
            else if(pigeon[p] != look) {
                crossing ++;
                pigeon[p] = look;
            }
        }

        System.out.println(crossing);
    }
}