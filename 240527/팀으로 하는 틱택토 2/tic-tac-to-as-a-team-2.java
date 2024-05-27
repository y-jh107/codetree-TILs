import java.util.*;

public class Main {
    public static int[][] board = new int[3][3];
    public static int[][] winComb = new int[100][2];
    public static int idx = 0;

    public static boolean isTrue(int n1, int n2, int n3) {
        if(n1 == n2 && n1 != n3) return true;
        else if(n1 == n3 && n1 != n2) return true;
        else if(n2 == n3 && n1 != n2) return true;

        return false;
    }

    public static boolean case1(int i, int j) {
        int n1 = board[i][j], n2 = board[i][j + 1], n3 = board[i][j + 2];

        if(isTrue(n1, n2, n3)){
            if(n1 == n3 || n2 == n3) {
                if(!isWinner(n1, n2)) {
                    winComb[idx][0] = n1;
                    winComb[idx ++][1] = n2;
                }
            }
            else if(n1 == n2) {
                if(!isWinner(n1, n3)) {
                    winComb[idx][0] = n1;
                    winComb[idx ++][1] = n2;
                }
            }

            return true;
        }

        return false;
    }

    public static boolean case2(int i, int j) {
        int n1 = board[i][j], n2 = board[i + 1][j], n3 = board[i + 2][j];

        if(isTrue(n1, n2, n3)){
            if(n1 == n3 || n2 == n3) {
                if(!isWinner(n1, n2)) {
                    winComb[idx][0] = n1;
                    winComb[idx ++][1] = n2;
                }
            }
            else if(n1 == n2) {
                if(!isWinner(n1, n3)) {
                    winComb[idx][0] = n1;
                    winComb[idx ++][1] = n2;
                }
            }

            return true;
        }

        return false;
    }

    public static boolean case3(int i, int j) {
        int n1 = board[i][j], n2 = board[i + 1][j + 1], n3 = board[i + 2][j + 2];

        if(isTrue(n1, n2, n3)){
            if(n1 == n3 || n2 == n3) {
                if(!isWinner(n1, n2)) {
                    winComb[idx][0] = n1;
                    winComb[idx ++][1] = n2;
                }
            }
            else if(n1 == n2) {
                if(!isWinner(n1, n3)) {
                    winComb[idx][0] = n1;
                    winComb[idx ++][1] = n2;
                }
            }

            return true;
        }

        return false;
    }

    public static boolean case4(int i, int j) {
        int n1 = board[i][j], n2 = board[i + 1][j - 1], n3 = board[i + 2][j - 2];

        if(isTrue(n1, n2, n3)){
            if(n1 == n3 || n2 == n3) {
                if(!isWinner(n1, n2)) {
                    winComb[idx][0] = n1;
                    winComb[idx ++][1] = n2;
                }
            }
            else if(n1 == n2) {
                if(!isWinner(n1, n3)) {
                    winComb[idx][0] = n1;
                    winComb[idx ++][1] = n3;
                }
            }

            return true;
        }

        return false;
    }

    public static boolean isWinner(int n1, int n2) {
        for(int k = 0; k < 100; k ++) {
            if(winComb[k][0] == n1 && winComb[k][1] == n2) return true;
            if(winComb[k][0] == n2 && winComb[k][1] == n1) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        for(int i = 0; i < 3; i ++) {
            int line = sc.nextInt();

            for(int j = 2; j >= 0; j --) {
                board[i][j] = line % 10;
                line /= 10;
            }
        }

        for(int i = 0; i < 3; i ++) {
            for(int j = 0; j < 3; j ++) {
                if(i == 0 && j == 0) {
                    if(case1(i, j)) ans ++;
                    if(case2(i, j)) ans ++;
                    if(case3(i, j)) ans ++;
                }

                if(i > 0 && j == 0) {
                    if(case1(i, j)) ans ++;
                }

                if(j == 1 && i == 0) {
                    if(case2(i, j)) ans ++;
                }

                if(j == 2 && i == 0) {
                    if(case2(i, j)) ans ++;
                    if(case4(i, j)) ans ++;
                }
            }
        }

        System.out.println(ans);
    }
}