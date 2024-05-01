import java.util.*;

public class Main {
    public static int r, c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        char[][] arr = new char[r][c];
        int cnt = 0, x = 0, y = 0;

        for(int i = 0; i < r; i ++) {
            for(int j = 0; j < c; j ++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        for(int i = 1; i < r - 1; i ++) {
            for(int j = i + 1; j < r - 1; j ++) {
                for(int k = 1; k < c - 1; k ++) {
                    for(int l = k + 1; l < c - 1; l ++) {
                        if(arr[x][y] != arr[i][k] && arr[i][k] != arr[j][l] && arr[j][l] != arr[r - 1][c - 1]) {
                            //System.out.println(i + " " + k + ", " + j + " " + l);
                            //System.out.println();
                            cnt ++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}