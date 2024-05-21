import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int maxNum = 0;

        for(int i = x; i <= y; i ++) {
            int idx = 0, num = i;
            int[] d = new int[5];
            while(num > 0) {
                d[idx ++] = num % 10;
                num /= 10;
            }

            int sum = 0;
            for(int j = 0; j < 5; j ++) {
                sum += d[j];
            }

            maxNum = Math.max(maxNum, sum);
        }

        System.out.println(maxNum);
    }
}