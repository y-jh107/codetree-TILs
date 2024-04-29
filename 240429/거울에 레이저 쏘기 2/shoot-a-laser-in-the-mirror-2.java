import java.util.Scanner;

public class Main {
    public static int[] dx = {0, -1, 0, 1};
    public static int[] dy = {1, 0, -1, 0};
    public static int n;

    public static int decision1(int dir) {
        if (dir == 0) {
            return 1;
        }
        else if(dir == 1) {
            return 0;
        }
        else if(dir == 2) {
            return 3;
        }
        else
            return 2;
    }   

    public static int decision2(int dir) {
        if(dir == 0)
            return 3;
        else if(dir == 1)
            return 0;
        else if(dir == 2)
            return 1;
        else
            return 2;
    }
    public static boolean check(int i, int j) {
        return(i >= 0 && i < n && j >= 0 && j < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        char[][] mirror = new char[n][n];

        for(int i = 0; i < n; i ++) {
            String m = sc.next();
            for(int j = 0; j < n; j ++) {
                mirror[i][j] = m.charAt(j);
            }
        }

        int start = sc.nextInt(), dir;
        int i = 0, j = 0;

        if (start >= 1 && start <= n) {
            dir = 3;
            i = 0;
            j = start - 1;
        }
        else if (start >= n && start <= 2 * n) {
            dir = 2;
            i = start - n - 1;
            j = n - 1;
        }
        else if (start >= 2 * n && start <= 3 * n) {
            dir = 1;
            i = n - 1;
            j = 3 * n - start;
        }
        else {
            dir = 0;
            i = 4 * n - start;
            j = 0;
        }

        int cnt = 0;
        while(true) {
            //System.out.println(cnt);
            //System.out.println("dir: " + dir + " i: " + i + " j: " + j);

            if(mirror[i][j] == '/') {
                dir = decision1(dir);
                cnt ++;
            }
            else if(mirror[i][j] == '\\') {
                dir = decision2(dir);
                cnt ++;
            }

            i += dx[dir];
            j += dy[dir];

            //System.out.println("dir: " + dir + " i: " + i + " j: " + j);

            boolean ch = check(i, j);
            if(!ch) break;
        }

        System.out.println(cnt);
    }
}