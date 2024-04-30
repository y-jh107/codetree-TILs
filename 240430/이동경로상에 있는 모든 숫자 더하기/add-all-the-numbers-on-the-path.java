import java.util.Scanner;

public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int n, dir_num = 3;

    public static void dir1() {
        dir_num = (dir_num + 1) % 4;
    }

    public static void dir2() {
        dir_num = (dir_num + 3) % 4;
    }

    public static boolean isTrue(int x, int y) {
        return (x > 0 && x < n && y > 0 && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt(), x = n / 2, y = n / 2, sum = 0;
        String d = sc.next();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j ++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sum += arr[x][y];

        for(int i = 0; i < t; i ++) {
            char dir = d.charAt(i);
            if(dir == 'R') 
                dir1();
            else if(dir == 'L')
                dir2();
            else if(dir == 'F') {
                int nx = x + dx[dir_num];
                int ny = y + dy[dir_num];

                //boolean check = isTrue(nx, ny);
                if(isTrue(nx, ny)) {
                    sum += arr[nx][ny];
                    x += dx[dir_num];
                    y += dy[dir_num];
                }
            }
        }

        System.out.println(sum);
    }
}