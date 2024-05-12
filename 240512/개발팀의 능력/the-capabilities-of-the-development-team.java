import java.util.*;

public class Main {
    public static int MAX_INT = Integer.MAX_VALUE;
    public static int MAX_N = 5;

    public static int n = MAX_N;
    public static int correct = -1;
    public static int[] arr = new int[MAX_N];

    public static int diff(int i, int j, int k, int l) {
        int totalSum = 0;

        for(int t = 0; t < n; t ++) {
            totalSum += arr[i];
        }

        int sum1 = arr[i] + arr[j];
        int sum2 = arr[k] + arr[l];
        int sum3 = totalSum - sum1 - sum2;

        if(sum1 != sum2 && sum1 != sum3 && sum2 != sum3) {
            correct ++;
            int minValue = MAX_INT, maxValue = 0;
            minValue = Math.min(sum1, sum2);
            minValue = Math.min(minValue, sum3);
            maxValue = Math.max(sum1, sum2);
            maxValue = Math.max(maxValue, sum3);

            return maxValue - minValue;
        }

        else {
            return totalSum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        int minDiff = MAX_INT;
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                for(int k = 0; k < n; k++)
                    for(int l = k + 1; l < n; l++) {
                        if(k == i || k == j || l == i || l == j)
                            continue;
                        
                        minDiff = Math.min(minDiff, diff(i, j, k, l));
                    }

        if(correct == -1) System.out.println(correct);
        else System.out.print(minDiff);
    }
}