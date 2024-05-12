import java.util.*;

public class Main {
    public static int MAX_INT = Integer.MAX_VALUE;
    public static int MAX_N = 5;

    public static int n = MAX_N, correct = -1, totalSum = 0;
    public static int[] arr = new int[MAX_N];

    public static int diff(int i, int j, int k) {
        int sum1 = arr[i] + arr[j];
        int sum2 = arr[k];
        int sum3 = totalSum - sum1 - sum2;

         if(sum1 == sum2 || sum1 == sum3 || sum2 == sum3) return totalSum;

        correct ++;

        int ret = Math.abs(sum1 - sum2);
        ret = Math.max(ret, Math.abs(sum2 - sum3));
        ret = Math.max(ret, Math.abs(sum1 - sum3));

        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int minDiff = MAX_INT;
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                for(int k = 0; k < n; k++) {
                    if(k == i || k == j)
                        continue;
                    minDiff = Math.min(minDiff, diff(i, j, k));
                }

        if(correct == -1) System.out.println(correct);
        else System.out.print(minDiff);
    }
}