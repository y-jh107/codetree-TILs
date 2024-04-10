import java.util.Scanner;

public class Main {
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, dirNum = 3;
        String order = sc.next();

        for(int i = 0; i < order.length(); i ++) {
            char dir = order.charAt(i);

            if(dir == 'L') {
                dirNum = (dirNum + 3) % 4;
            } else if(dir == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else if(dir == 'F') {
                //System.out.println(dirNum + " " + dx[dirNum] + " " + dy[dirNum]);
                x += dx[dirNum];
                y += dy[dirNum];
            }

            //System.out.println(dirNum);
        }

        System.out.println(x + " " + y);
    }
}