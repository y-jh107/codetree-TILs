import java.util.*;

public class Main {
    public static int n, k;
    public static final int MAX_N = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] candy = new int[MAX_N + 1];
        int maxValue = 0;

        //System.out.println(n + " "+ k);
        for(int i = 0; i < n; i ++) {
            int candies = sc.nextInt(), idx = sc.nextInt();
            //System.out.println(candies + " " + idx);
            candy[idx] += candies;
        }

        for(int i = 0; i <= MAX_N; i ++) {
            int sum = 0;
            //System.out.println(i + " " + i + k);
            if(i + k < MAX_N && i - k >= 0) {
                for(int j = i - k; j <= i + k; j ++) {
                    //System.out.println(j + " " + candy[j]); 
                    sum += candy[j];
                }
            }
            else if(i - k < 0 && i + k < MAX_N) {
                for(int j = 0; j <= i + k; j ++) {
                    //System.out.println(j + " " + candy[j]);
                    sum += candy[j];
                }
            }
            else if(i - k >= 0 && i + k >= MAX_N) {
                for(int j = i - k; j <= MAX_N; j ++) {
                    //System.out.println(j + " " + candy[j]);
                    sum += candy[j];
                }
            }
            else {
                for(int j = 0; j <= MAX_N; j ++) {
                    //System.out.println(j + " " + candy[j]);
                    sum += candy[j];
                }
            }               
            
            maxValue = Math.max(maxValue, sum);
        }

        System.out.println(maxValue);
    }
}