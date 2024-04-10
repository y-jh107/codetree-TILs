import java.util.Scanner;

public class Main {
    public static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int timePassed = 1;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] aMove = new int[1001], bMove = new int[1001];
        String[] winner = new String[1001];

        for (int i = 0; i < n; i ++) {
            int v = sc.nextInt(), t = sc.nextInt();
            for (int j = 0; j < t; j ++) {
                aMove[timePassed ++] += v;
           }
        }

        timePassed = 1;

        for (int i = 1; i < m; i ++) {
            int v = sc.nextInt(), t = sc.nextInt();
            for (int j = 0; j < t; j ++) {
                bMove[timePassed ++] += v;
            }
        }

        for (int i = 0; i < winner.length; i ++) {
            if(aMove[i] > bMove[i]) winner[i] = "a";
            else winner[i] = "b";
        }

        int newWins = 0;
        String win = "c";
        for (int i = 0; i < winner.length; i ++) {
            if (winner[i].equals(win)) continue;
            win = winner[i];
            newWins ++;
        }

        System.out.println(newWins);
    }
}