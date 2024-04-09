import java.util.Scanner;

public class Main {
    public static int[] aRobot = new int[1000001];
    public static int[] bRobot = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int aMove = 1, bMove = 1, cnt = 0;

        if(n > m) {
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

            for(int i = bMove; i < bRobot.length; i ++) {
                bRobot[i] = bRobot[i - 1];
            }
        }

        else {
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

            for(int i = aMove; i < aRobot.length; i ++) {
                    aRobot[i] = aRobot[i - 1];
            }
        }

        int check1 = 0, check2 = 0;
        for(int i = 1; i < (aMove > bMove ? aMove : bMove); i ++) {
            //System.out.println(aRobot[i] + " " + bRobot[i]);
            if(aRobot[i] != 0 && aRobot[i] == bRobot[i] && aRobot[i - 1] != bRobot[i - 1]) {
                cnt ++;
            }
        }

        System.out.println(cnt);
    }
}