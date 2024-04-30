import java.util.*;

public class Main {
    public static int n;
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] house = new int[n];

        for(int i = 0; i < n; i ++) {
            house[i] = sc.nextInt();
        }

        int min_value = INT_MAX;

        for(int i = 0; i < n; i ++) {
            int sum = 0;
            for(int j = 0; j < n; j ++) {
                sum += house[j] * Math.abs(i - j);
            }
            //System.out.println(sum);
            if(min_value > sum) min_value = sum;
        }

        System.out.println(min_value);
    }
}