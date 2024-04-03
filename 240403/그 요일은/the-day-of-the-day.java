import java.util.Scanner;

public class Main {
    public static int[] daysOfMonth = new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] days = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt(), cnt = 0;
        String day = sc.next();

        int diff = totalDays(m2, d2) - totalDays(m1, d1);

        //System.out.println(day);

        while(diff > 0) {
            //System.out.println(days[diff % 7]);
            if(days[diff % 7].equals(day)) cnt ++;

            diff --;
        }

        System.out.println(cnt);
    }

    public static int totalDays(int m, int d) {
        int passedDays = 0;

        for(int i = 1; i < m; i ++) {
            passedDays += daysOfMonth[i];
        }
        passedDays += d;

        return passedDays;
    }
}