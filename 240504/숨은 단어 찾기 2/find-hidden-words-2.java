import java.util.Scanner;

public class Main {
    public static int n, m;

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }

    public static int findWord(char[][] arr, int i, int j) {
        int cnt = 0;

        if(inRange(i, j + 1) && inRange(i, j + 2) && arr[i][j + 1] == 'E' && arr[i][j + 2] == 'E')
            cnt ++;
            
        if(inRange(i, j - 1) && inRange(i, j - 2) && arr[i][j - 1] == 'E' && arr[i][j - 2] == 'E') 
            cnt ++;

        if(inRange(i + 1, j) && inRange(i + 2, j) && arr[i + 1][j] == 'E' && arr[i + 2][j] == 'E')
            cnt ++;

        if(inRange(i - 1, j) && inRange(i - 2, j) && arr[i - 1][j] == 'E' && arr[i - 2][j] == 'E')
            cnt ++;

        if(inRange(i - 1, j - 1) && inRange(i - 2, j - 2) && arr[i - 1][j - 1] == 'E' && arr[i - 2][j - 2] == 'E')
            cnt ++;

        if(inRange(i + 1, j + 1) && inRange(i + 2, j + 2) && arr[i + 1][j + 1] == 'E' && arr[i + 2][j + 2] == 'E')
            cnt ++;

        if(inRange(i - 1, j + 1) && inRange(i - 2, j + 2) && arr[i - 1][j + 1] == 'E' && arr[i - 2][j + 2] == 'E')

            cnt ++;
        if(inRange(i + 1, j - 1) && inRange(i + 2, j - 2) && arr[i + 1][j - 1] == 'E' && arr[i + 2][j - 2] == 'E')
            cnt ++;

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int cnt = 0;
        char[][] arr = new char[n][m];

        for(int i = 0; i < n; i ++) {
            String str = sc.next();
            for(int j = 0; j < m; j ++) {
                arr[i][j] = str.charAt(j);
            }
        }

        /*for(int i = 0; i < n; i ++) {
            for(int j = 0; j < m; j ++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < m; j ++) {
                if(arr[i][j] == 'L') {
                    //System.out.println("(" + i + "," + j + ") " + cnt);
                    cnt += findWord(arr, i, j);
                }
            }
        }

        System.out.println(cnt);
    }
}