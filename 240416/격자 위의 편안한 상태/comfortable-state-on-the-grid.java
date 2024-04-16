import java.util.Scanner;

public class Main {
    public static int[][] colored = new int [101][101];
    public static int n;

    public static boolean inRange(int x, int y) {
        return (x - 1 >= 0 && x + 1 <= n && y - 1 >= 0 && y + 1 <= n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        while (m -- > 0) {
            int r = sc.nextInt() - 1, c = sc.nextInt() - 1, colors = 0;
            colored[r][c] = 1;

            if(r - 1 >= 0 && colored[r - 1][c] == 1) colors ++;
            if(r + 1 < n && colored[r + 1][c] == 1) colors ++;
            if(c - 1 >= 0 && colored[r][c - 1] == 1) colors ++;
            if(c + 1 < n && colored[r][c + 1] == 1) colors ++;

            if(colors >= 3) System.out.println(1);
            else System.out.println(0);
        }
    }
}