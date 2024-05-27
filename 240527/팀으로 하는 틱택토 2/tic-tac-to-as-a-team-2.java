import java.util.*;

public class Main {
    public static int whichCase = 0, idx = 0;
    public static int[][] tic = new int[3][3];
    public static int[][] winner = new int[100][2];

    public static boolean isWinner(int i, int j) {
        boolean isTrue = true;

        for(int k = 0; k < 100; k ++) {
            if(winner[k][0] == i && winner[k][1] == j) isTrue = false;
            if(winner[k][0] == j && winner[k][1] == i) isTrue = false;
        }

        return isTrue;
    }

    public static boolean case1(int i, int j) {
        if(tic[i + 1][j] == tic[i][j] && tic[i + 2][j] != tic[i][j]) {
            winner[idx][0] = i;
            winner[idx][1] = j;
            idx ++;
            return true;
        }
        else if(tic[i + 2][j] == tic[i][j] && tic[i +1][j] != tic[i][j]) {
            winner[idx][0] = i;
            winner[idx][1] = j;
            idx ++;
            return true;
        }
        else if(tic[i][j] != tic[i + 1][j] && tic[i + 1][j] == tic[i + 2][j]) {
            winner[idx][0] = i;
            winner[idx][1] = j;
            idx ++;
            return true;
        }

        return false;
    }

    public static boolean case2(int i, int j) {
        if(tic[i][j] == tic[i][j + 1] && tic[i][j] != tic[i][j + 2]) {
            winner[idx][0] = i;
            winner[idx][1] = j;
            idx ++;
            return true;
        }
        else if(tic[i][j] == tic[i][j + 2] && tic[i][j] != tic[i][j + 1]) {
            winner[idx][0] = i;
            winner[idx][1] = j;
            idx ++;
            return true;
        }
        else if(tic[i][j] != tic[i][j + 1] && tic[i][j + 1] == tic[i][j + 2]) {
            winner[idx][0] = i;
            winner[idx][1] = j;
            idx ++;
            return true;
        }

        return false;
    }

    public static boolean case3(int i, int j) {
        if(tic[i][j] == tic[i + 1][j + 1] && tic[i][j] != tic[i + 2][j + 2]) {
            winner[idx][0] = i;
            winner[idx][1] = j;
            idx ++;
            return true;
        }
        else if(tic[i][j] == tic[i + 2][j + 2] && tic[i][j] != tic[i + 1][j + 1]) {
            winner[idx][0] = i;
            winner[idx][1] = j;
            idx ++;
            return true;
        }
        else if(tic[i][j] != tic[i + 1][j + 1] && tic[i + 1][j + 1] == tic[i + 2][j + 2]) {
            winner[idx][0] = i;
            winner[idx][1] = j;
            idx ++;
            return true;
        }

        return false; 
    }

    public static boolean case4(int i, int j) {
        if(tic[i][j] == tic[i + 1][j - 1] && tic[i][j] != tic[i + 2][j - 2]) {
            winner[idx][0] = i;
            winner[idx][1] = j;
            idx ++;
            return true;
        }
        else if(tic[i][j] == tic[i + 2][j - 2] && tic[i][j] != tic[i + 1][j - 1]) {
            winner[idx][0] = i;
            winner[idx][1] = j;
            idx ++;
            return true;
        }
        else if(tic[i][j] != tic[i + 1][j - 1] && tic[i + 1][j - 1] == tic[i + 2][j - 2]) {
            winner[idx][0] = i;
            winner[idx][1] = j;
            idx ++;
            return true;
        }

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
        int idx = 0;
        for(int i = 0; i < 3; i ++) {
            for(int j = 0; j < 3; j ++) {
                if(i == 0 && j == 0) {
                    if(case1(i, j) && !isWinner(i, j)){
                        ans ++;
                    }

                    if(case2(i, j) && !isWinner(i, j)) {
                        ans ++;
                    }

                    if(case3(i, j) && !isWinner(i, j)) {
                        ans ++;
                    }
                }

                else if(i == 0 && j == 1) {
                    if(case1(i, j) && !isWinner(i, j)) {
                        ans ++;
                    }
                }

                else if(i == 0 && j == 2) {
                    if(case1(i, j) && !isWinner(i, j)) {
                        ans ++;
                    }

                    if(case4(i, j) && !isWinner(i, j)) {
                        ans ++;
                    }
                }

                else if(i > 0 && j == 0) {
                    if(case2(i, j) && !isWinner(i, j)) ans ++;
                }
            }
        }

        System.out.println(ans); 
    }
}