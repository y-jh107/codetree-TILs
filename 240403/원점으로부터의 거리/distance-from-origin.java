import java.util.*;
class Point implements Comparable<Point> {
    int x, y, num;

    public Point(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }

    @Override
    public int compareTo(Point p) {
        return (this.x + this.y) - (p.x + p.y);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] p = new Point[n];

        for(int i = 0; i < n; i ++) {
            p[i] = new Point(sc.nextInt(), sc.nextInt(), i + 1);
        }

        Arrays.sort(p);

        for(int i = 0; i < n; i ++) {
            System.out.println(p[i].num);
        }

    }
}