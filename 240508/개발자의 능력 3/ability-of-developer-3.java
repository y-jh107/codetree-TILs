import java.util.*;

public class Main {
    public static int[] developers = new int[6];

    public static int getDiff(int i, int j, int k) {
        int sum1 = developers[i] + developers[j] + developers[k];
        int sum2 = 0;
        for(int l = 0; l < 6; l ++) {
            sum2 += developers[l];
        }
        sum2 -= sum1;
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minDiff = 100;

        for(int i = 0; i < 6; i ++) {
            developers[i] = sc.nextInt();
        }

        for(int i = 0; i < 6; i ++) {
            for(int j = i + 1; j < 6; j ++) {
                for(int k = j + 1; k < 6; k ++) {
                    minDiff = Math.min(minDiff, getDiff(i, j, k));
                }
            }
        }

        System.out.println(minDiff);
    }
}