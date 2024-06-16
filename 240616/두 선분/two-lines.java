import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt(), x2 = sc.nextInt();
        int x3 = sc.nextInt(), x4 = sc.nextInt();

        boolean isOverlap = false;

        for(int i = x1; i <= x2; i ++) {
            if(i == x3 || i == x4) {
                isOverlap = true;
                break;
            }
        }

        for(int i = x3; i <= x4; i ++) {
            if(i == x1 || i == x2) {
                isOverlap = true;
                break;
            }
        }
        
        if(isOverlap) System.out.println("intersecting");
        else System.out.println("nonintersecting");
    }
}