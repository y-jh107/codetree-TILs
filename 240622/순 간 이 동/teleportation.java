import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        int x = sc.nextInt(), y = sc.nextInt();

        int minDis = 100;

        // 1) a~b까지 걸어서 이동한 경우
        int dis = Math.abs(b - a);
        minDis = Math.min(minDis, dis);

        // 2) a~x까지 걸어서 이동 후 텔레포트 사용, y~b까지 이동
        dis = Math.abs(x - a);
        dis += Math.abs(b - y);
        minDis = Math.min(minDis, dis);

        // 3) a~y까지 걸어서 이동 후 텔레포트 사용, x~b까지 이동
        dis = Math.abs(y - a);
        dis += Math.abs(b - x);
        minDis = Math.min(minDis, dis);


        System.out.println(minDis);
    }
}