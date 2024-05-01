import java.util.*;

public class Main {
    public static int r, c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        String[][] arr = new String[r][c];
        int cnt = 0, x = 0, y = 0;

        for(int i = 0; i < r; i ++) {
            for(int j = 0; j < c; j ++) {
                arr[i][j] = sc.next();
            }
        }

        while(true) {
            if(x == r - 1 && y < c - 1) {
                cnt = 0;
                break;
            }
            else if(x < r - 1 && y == c - 1) {
                cnt = 0;
                break;
            }
            String current = arr[x][y];

            for(int i = x + 1; i < r; i ++) {
                for(int j = y + 1; j < c; j ++) {
                    if(!(arr[i][j].equals(current))) {
                        x = i;
                        y = j;
                        cnt ++;
                        break;
                    }
                }
            }

            if(x == r - 1 && y == c - 1) break;
        }

        System.out.println(cnt);
    }
}