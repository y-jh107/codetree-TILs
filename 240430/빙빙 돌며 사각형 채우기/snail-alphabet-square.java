import java.util.Scanner;

public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int n, m, dir = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int num = 1, i = 0, j = 0;
        char[][] arr = new char[n][m];
        char cnt = 'A';
        arr[i][j] = cnt ++;

        while(true) {
            if(num == n * m) break;

            //System.out.println(i + " " + j );
            if(i == n - 1 && j == 0 && dir == 2) dir = 3;
            else if(i == n - 1 && j == m - 1 && dir == 1) dir = 2;
            else if(i == 0 && j == m - 1 && dir == 0) dir = 1;

                      

            if(arr[i + dx[dir]][j + dy[dir]] != '\0') {
                dir = (dir + 1) % 4;
                //System.out.println(dir + " " + i + " " + j);
                continue;
            }

            i += dx[dir];
            j += dy[dir];

            arr[i][j] = cnt ++;
            num ++;
        }

        for(i = 0; i < n; i ++) {
            for(j = 0; j < m; j ++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}