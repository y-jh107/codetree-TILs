import java.util.*;

public class Main {
    public static boolean isOverlap1(int x1, int x2, int a1, int a2) {
        if(x2 < a1 || a2 < x1)
            return false;

        return true;
    }

    public static boolean isOverlap2(int y1, int y2, int b1, int b2) {
        if(b2 < y1 || y2 < b1)
            return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int a1 = sc.nextInt(), b1 = sc.nextInt();
        int a2 = sc.nextInt(), b2 = sc.nextInt();

        boolean isOverlap = false;

        if(isOverlap1(x1, x2, a1, a2) && isOverlap2(y1, y2, b1, b2))
            System.out.println("overlapping");
        else System.out.println("nonoverlapping");
    }
}