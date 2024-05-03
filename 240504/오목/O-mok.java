import java.util.*;

public class Main {
    public static int[][] omok = new int[19][19];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int winner = 0, winX = 0, winY = 0;
        boolean checkWin = false;

        for(int i = 0; i < 19; i ++) {
            for(int j = 0; j < 19; j ++) {
                omok[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 19; i ++) {
            for(int j = 0; j < 19; j ++) {
                if(omok[i][j] != 0) {
                    for(int k = i + 1; k < i + 5; k ++) {
                        if(k == 19) {
                            checkWin = false;
                            break;
                        }
                        if(omok[k][j] != omok[i][j]) {
                            checkWin = false;
                            break;
                        }
                        checkWin = true;
                    }

                    if(checkWin) {
                        winner = omok[i][j];
                        winX = i + 3;
                        winY = j + 1;
                        break;
                    }

                    for(int k = j + 1; k < j + 5; k ++) {
                        if(k == 19) {
                            checkWin = false;
                            break;
                        }
                        if(omok[i][k] != omok[i][j]) {
                            checkWin = false;
                            break;
                        }
                        checkWin = true;
                    }
                    if(checkWin) {
                        winner = omok[i][j];
                        winX = i + 1;
                        winY = j + 3;
                        break;
                    }

                    int add = 1;
                    while(add < 5) {
                        if(i + add == 19 || j + add == 19) {
                            checkWin = false;
                            break;
                        }
                        if(omok[i + add][j + add] != omok[i][j]) {
                            checkWin = false;
                            break;
                        }
                        add ++;
                        checkWin = true;
                    }

                    if(checkWin) {
                        winner = omok[i][j];
                        winX = i + 3;
                        winY = j + 3;
                        break;
                    }

                    add = 1;
                    while(add < 5) {
                        if(i + add == 19 || j - add < 0) {
                            checkWin = false;
                            break;
                        }
                        
                        if(omok[i + add][j - add] != omok[i][j]) {
                            checkWin = false;
                            break;
                        }
                        
                        add ++;
                        checkWin = true;
                    }

                    if(checkWin) {
                        winner = omok[i][j];
                        winX = i + 3;
                        winY = j - 1;
                        break;
                    }
                }
            }
        }

        System.out.println(winner);
        if(winner != 0) System.out.println(winX + " " + winY);
    }
}