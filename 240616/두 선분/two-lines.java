import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt(), x2 = sc.nextInt();
        int x3 = sc.nextInt(), x4 = sc.nextInt();

        boolean isOverlap = false;

        if(x2 >= x3 || x1 >= x3) isOverlap = true;

        if(isOverlap) System.out.println("intersecting");
        else System.out.println("nonintersecting");
    }
}