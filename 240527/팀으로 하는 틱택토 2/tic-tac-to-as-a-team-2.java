import java.util.*;

public class Main {
    public static int whichCase = 0;
    public static int[][] tic = new int[3][3];

    public static boolean case1(int i, int j) {
        if(tic[i + 1][j] == tic[i][j] && tic[i + 2][j] != tic[i][j]) return true;
        else if(tic[i + 2][j] == tic[i][j] && tic[i +1][j] != tic[i][j]) return true;
        else if(tic[i][j] != tic[i + 1][j] && tic[i + 1][j] == tic[i + 2][j]) return true;

        return false;
    }

    public static boolean case2(int i, int j) {
        if(tic[i][j] == tic[i][j + 1] && tic[i][j] != tic[i][j + 2]) return true;
        else if(tic[i][j] == tic[i][j + 2] && tic[i][j] != tic[i][j + 1]) return true;
        else if(tic[i][j] != tic[i][j + 1] && tic[i][j + 1] == tic[i][j + 2]) return true;

        return false;
    }

    public static boolean case3(int i, int j) {
        if(tic[i][j] == tic[i + 1][j + 1] && tic[i][j] != tic[i + 2][j + 2]) return true;
        else if(tic[i][j] == tic[i + 2][j + 2] && tic[i][j] != tic[i + 1][j + 1]) return true;
        else if(tic[i][j] != tic[i + 1][j + 1] && tic[i + 1][j + 1] == tic[i + 2][j + 2]) return true;

        return false; 
    }

    public static boolean case4(int i, int j) {
        if(tic[i][j] == tic[i + 1][j - 1] && tic[i][j] != tic[i + 2][j - 2]) return true;
        else if(tic[i][j] == tic[i + 2][j - 2] && tic[i][j] != tic[i + 1][j - 1]) return true;
        else if(tic[i][j] != tic[i + 1][j - 1] && tic[i + 1][j - 1] == tic[i + 2][j - 2]) return true;

        return false; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i ++) {
            int col = sc.nextInt();
            for(int j = 2; j >= 0; j --) {
                tic[i][j] = col % 10;
                col /= 10;
            }
        }

        int ans = 0;

        for(int i = 0; i < 3; i ++) {
            for(int j = 0; j < 3; j ++) {
                if(i == 0 && j == 0) {
                    if(case1(i, j)){
                        ans ++;
                    }

                    if(case2(i, j)) {
                        ans ++;
                    }

                    if(case3(i, j)) {
                        ans ++;
                    }
                }

                else if(i == 0 && j == 1) {
                    if(case1(i, j)) {
                        ans ++;
                    }
                }

                else if(i == 0 && j == 2) {
                    if(case1(i, j)) {
                        ans ++;
                    }

                    if(case4(i, j)) {
                        ans ++;
                    }
                }

                else if(i > 0 && j == 0) {
                    if(case2(i, j)) ans ++;
                }
            }
        }

        System.out.println(ans); 
    }
}