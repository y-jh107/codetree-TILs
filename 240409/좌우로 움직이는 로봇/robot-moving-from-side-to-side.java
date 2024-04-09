import java.util.Scanner;

public class Main {
    public static int[] aRobot = new int[1000001];
    public static int[] bRobot = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int aMove = 1, bMove = 1, cnt = 0;

        for(int i = 0; i < n; i ++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            while(t -- > 0) {
                if(d == 'R') {
                    aRobot[aMove] = aRobot[aMove - 1] + 1;
                    aMove ++;
                }
                else if(d == 'L') {
                    aRobot[aMove] = aRobot[aMove - 1] - 1;
                    aMove ++;
                }
            }
        }

        for(int i = 0; i < m; i ++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            while(t -- > 0) {
                if(d == 'R') {
                    bRobot[bMove] = bRobot[bMove - 1] + 1;
                    bMove ++;
                }
                else if(d == 'L') {
                    bRobot[bMove] = bRobot[bMove - 1] - 1;
                    bMove ++;
                }
            }
        }

        int check = 0;
        for(int i = 1; i < (aMove > bMove ? aMove : bMove); i ++) {
            if(aRobot[i] != 0 && aRobot[i] == bRobot[i] && aRobot[i] != check) {
                cnt ++;
                check = aRobot[i];
            }
        }

        System.out.println(cnt);
    }
}