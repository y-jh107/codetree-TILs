import java.util.*;

public class Main {
    public static int currentDate = 11, currentHour = 11, currentMinute = 11;

    public static int countDays(int d, int h, int m) {
        if(d < currentDate) return -1;
        int cnt = 0;

        while(true) {
            if(currentDate == d && currentHour == h && currentMinute == m) {
                break;
            }

            cnt ++;
            currentMinute ++;

            if(currentMinute == 60) {
                currentHour ++;
                currentMinute = 0;
            }

            if(currentHour == 24) {
                currentDate ++;
                currentHour = 0;
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt();

        int result = countDays(h, m, d);
        System.out.println(result);
    }
}