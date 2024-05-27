import java.util.*;

public class Main {
    public static int whichCase = 0;

    public static boolean inRange(int i, int j) {
        if(i + 1 < 3 && i + 2 < 3 && j < 3) {
            whichCase = 1;
            return true;
        }
        else if(i < 3 && j + 1 < 3 && j + 2 < 3) {
            whichCase = 2;
            return true;
        }
        else if((i + 1 < 3 && j + 1 < 3) && (i + 2 < 3 && j + 2 < 3)) {
            whichCase = 3;
            return true;
        }
        else if((i - 1 >= 0 && j - 1 >= 0) && (i - 2 >= 0 && j - 2 >= 0)) {
            whichCase = 4;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tic = new int[3][3];

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
                if(inRange(i, j)) {
                    if(whichCase == 1) {
                        if(tic[i][j] == tic[i + 1][j]) ans ++;
                        else if(tic[i][j] == tic[i + 2][j]) ans ++;
                    }

                    else if(whichCase == 2) {
                        if(tic[i][j] == tic[i][j + 1]) ans ++;
                        else if(tic[i][j] == tic[i][j + 2]) ans ++;
                    }

                    else if(whichCase == 3) {
                        if(tic[i][j] == tic[i + 1][j + 1]) ans ++;
                        else if(tic[i][j] == tic[i + 2][j + 2]) ans ++;
                    }

                    else if(whichCase == 4) {
                        if(tic[i][j] == tic[i - 1][j - 1]) ans ++;
                        else if(tic[i][j] == tic[i - 2][j - 2]) ans ++;
                    }
                }
            }
        }

        System.out.println(ans); 
    }
}