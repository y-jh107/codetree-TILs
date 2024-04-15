import java.util.Scanner;

public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static int setDir(char d) {
        if(d == 'N') return 1;
        else if(d == 'E') return 0;
        else if(d == 'S') return 3;
        else return 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 0, cnt = 0;
        boolean isTrue = false;

        while(n -- > 0) {
            char dir = sc.next().charAt(0);
            int times = sc.nextInt();
            int dirNum = setDir(dir);

            for(int i = 0; i < times; i ++) {
                x += dx[dirNum];
                y += dy[dirNum];
                cnt ++;
                if(x == 0 && y == 0) {
                    isTrue = true;
                    break;
                }
            }
            
            if(x == 0 && y == 0) {
                System.out.println(cnt);
                break;
            }
        }

        if(!isTrue) System.out.println(-1);
    }
}