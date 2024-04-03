import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //System.out.printf("%d %d %d %d\n", m1, d1, m2, d2);

        int passedDays = 0;
        while(true) {
            if(m1 == m2 && d1 > d2) break;

            passedDays ++;
            d1 ++;

            if(d1 > month[m1]) {
                m1 ++;
                d1 = 1;
            }
        }

        System.out.println(passedDays);
    }
}