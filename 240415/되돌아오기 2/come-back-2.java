import java.util.Scanner;

public class Main {
    public static int[] dx = {0, -1, 0, 1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = 0, x = 0, y = 0;
        int dirNum = 3;
        boolean isTrue = false;
        String str = sc.next();

        for(int i = 0; i < str.length(); i ++) {
            char dir = str.charAt(i);

            if(dir == 'F') {
                x += dx[dirNum];
                y += dy[dirNum];
                //System.out.println(x + " " + y);
            }
            else if(dir == 'L') {
                dirNum = (dirNum + 3) % 4;
                //System.out.println(dirNum);
            }
            else if(dir == 'R') {
                dirNum = (dirNum + 1) % 4;
                //System.out.println(dirNum);
            }

            sec ++;
            if(x == 0 && y == 0) {
                isTrue = true;
                System.out.println(sec);
                break;
            }
        }

        if(!isTrue) System.out.println(-1);
    } 
}