import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static String[] day = new String[] {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public static int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt(), diff = 0;
        
        int startDay = totalDays(m1, d1);
        int endDay = totalDays(m2, d2);

        diff = endDay - startDay + 1;
        
        while(diff < 0)
            diff += 7;

        System.out.println(day[diff]);
    }

    public static int totalDays(int m, int d) {
        int passedDays = 0;
        for(int i = 1; i < m; i ++) {
            passedDays += days[i];
        }
        passedDays += d;

        return passedDays;
    }
}