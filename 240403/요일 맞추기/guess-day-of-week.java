import java.util.Scanner;
import java.lang.Math;

public class Main {
    //public static 
    public static int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt(), diff = 0;
        
        int startDay = totalDays(m1, d1);
        int endDay = totalDays(m2, d2);

        diff = endDay - startDay;
        
        if(diff < 0) {
            diff = Math.abs(diff);
            int result = diff % 7;
            String[] day = new String[] {"Mon", "Sun", "Sat", "Fri", "Thu", "Wed", "Tue"};
            System.out.println(day[result]);
        }

        else {
            int result = diff % 7;
            String[] day = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
            System.out.println(day[result]);
        }
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