import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int ans = 0;

        for(int i = 0; i <= c / a + 1; i ++) {
            for(int j = 0; j <= c / b + 1; j ++) {
                int sum = a * i + b * j;
                if(sum <= c) {
                    ans = Math.max(ans, sum);
                }
            }
        }

        System.out.println(ans);
    }
}