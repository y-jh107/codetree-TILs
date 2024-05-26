import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int ans = 0;

        for(int i = 0; i < 1000; i ++) {
            int sum = 0;
            sum += a * i;
            for(int j = 0; j < 1000; j ++) {
                sum += b * j;
                if(sum <= c) {
                    ans = Math.max(ans, sum);
                }
            }
        }

        System.out.println(ans);
    }
}