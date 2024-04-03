import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chour = sc.nextInt(), cmin = sc.nextInt();
        int hour = sc.nextInt(), min = sc.nextInt();
        int passedMin = 0;

        while(true) {
            if(chour == hour && cmin == min) break;

            passedMin ++;
            cmin ++;

            if(cmin == 60) {
                chour ++;
                cmin = 0;
            }
        }

        System.out.println(passedMin);
    }
}