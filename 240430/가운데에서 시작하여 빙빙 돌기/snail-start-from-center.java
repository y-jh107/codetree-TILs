import java.util.Scanner;

public class Main {
    public static int[] dx = {0, -1, 0, 1};
    public static int[] dy = {1, 0, -1, 0};
    public static int n, dir = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        int i = n / 2, j = n / 2, cnt = 1;

        while(true) {
            if(!visited[i][j]) {
                visited[i][j] = true;
                arr[i][j] = cnt ++;
            }

            if(cnt > n * n) break;

            int nx = i + dx[dir];
            int ny = j + dy[dir];

            /*if(i == n - 1 && j < n && dir == 0) dir = 1;
            else if(i == 0 && j < n && dir == 1) dir = 2;
            else if(i < n && j == 0 && dir == 2) dir = 3;*/

            if(nx < 0 || nx >= n || ny < 0 || ny >= n || (visited[nx][ny])) {
                dir = (dir + 1) % 4;
            }
            else {
                i = nx;
                j = ny;
            }
        }

        for(i = 0; i < n; i ++) {
            for(j = 0; j < n; j ++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}