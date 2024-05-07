import java.util.*;

public class Main {
    public static int n, k;
    public static final int MAX_N = 100;

    public static boolean inRange(int x) {
        return (x - k >= 0 && x + k < MAX_N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] candy = new int[MAX_N + 1];
        int maxValue = 0;

        //System.out.println(n + " "+ k);
        for(int i = 0; i < n; i ++) {
            int candies = sc.nextInt(), idx = sc.nextInt();
            //System.out.println(idx + " " + candies);
            candy[idx] += candies;
        }

        for(int i = 0; i < MAX_N; i ++) {
            int sum = 0;
            if(inRange(i)) {
                for(int j = i - k; j <= i + k; j ++) {
                    //System.out.println(j + " " + candy[j]);
                    sum += candy[j];
                }
            }

            maxValue = Math.max(maxValue, sum);
        }

        System.out.println(maxValue);
    }
}