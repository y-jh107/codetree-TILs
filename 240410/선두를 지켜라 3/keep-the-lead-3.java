import java.util.Scanner;

public class Main {
    public static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int timePassed = 1;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] aMove = new int[1000001], bMove = new int[1000001];
        String[] winner = new String[1000001];

        aMove[0] = 0;
        bMove[0] = 0;
        for (int i = 0; i < n; i ++) {
            int v = sc.nextInt(), t = sc.nextInt();
            for (int j = 0; j < t; j ++) {
                aMove[timePassed] = aMove[timePassed - 1] + v;
                //System.out.println(aMove[timePassed] + " " + timePassed);
                timePassed ++;
           }
        }

        timePassed = 1;

        for (int i = 0; i < m; i ++) {
            int v = sc.nextInt(), t = sc.nextInt();
            for (int j = 0; j < t; j ++) {
                bMove[timePassed] = bMove[timePassed - 1] + v;
                //System.out.println(bMove[timePassed] + " " + timePassed);
                timePassed ++;
            }
        }

        winner[0] = "0";
        for (int i = 1; i < timePassed; i ++) {
            //System.out.println(aMove[i] + " " + bMove[i]);

            if(aMove[i] > bMove[i]) winner[i] = "a";
            else if(bMove[i] > aMove[i]) winner[i] = "b";
            else if(bMove[i] == aMove[i]) winner[i] = "a,b";

            //System.out.println(winner[i]);
        }

        int newWins = 0;
        for (int i = 1; i < timePassed; i ++) {
            if (winner[i] != winner[i - 1]) {
                newWins ++;
                //System.out.println(winner[i] + " " + winner[i - 1]);
            }
                
        }

        System.out.println(newWins);
    }
}