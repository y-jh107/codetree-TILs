import java.util.*;

public class Main {
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        int maxValue = 0;

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j ++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n - 2; j ++) {
                for(int k = 0; k < n; k ++) {
                    for(int l = 0; l < n - 2; l ++) {
                        if(i == k && Math.abs(j - l) <= 2)
                            continue;
                        int cnt1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                        int cnt2 = arr[k][l] + arr[k][l + 1] + arr[k][l + 2];

                        maxValue = Math.max(maxValue, cnt1 + cnt2);
                    }
                }
            }
        }

        System.out.println(maxValue);
    }
}