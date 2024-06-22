import java.util.*;

public class Main {
    public static int MAX_N = 100;

    public static int[] score = new int[MAX_N + 1];
    public static char[] game = new char[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int aScore = 0, bScore = 0;

        for(int i = 0; i < n; i ++) {
            game[i] = sc.next().charAt(0);
            score[i] = sc.nextInt();
        }

        char[] winner = new char[n + 1];
        //System.out.println(winner[0]);

        for(int i = 0; i < n; i ++) {
            char player = game[i];
            int diff = score[i];

            if(player == 'A') {
                aScore += diff;
            }
            else if(player == 'B') {
                bScore += diff;
            }

            if(aScore < bScore) 
                winner[i + 1] = 'B';
            else if(aScore > bScore)
                winner[i + 1] = 'A';
            else if(aScore == bScore)
                winner[i + 1] = ' ';
        }

        int ans = 0;

        for(int i = 1; i <= n; i ++) {
            //System.out.println(winner[i]);
            if(winner[i] != winner[i - 1]) {
                //System.out.println(winner[i + 1]);
                ans ++;
            }
        }

        if(n == 1) ans = 0;
        System.out.println(ans);
    }
}