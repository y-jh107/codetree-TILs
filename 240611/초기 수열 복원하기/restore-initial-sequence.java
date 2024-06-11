import java.util.*;

public class Main {
    public static int MAX_N = 1000 * 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        for(int i = 0; i < n - 1; i ++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];

        for(int i = 1; i <= n; i ++) {
            ans[0] = i;

            boolean[] isUsed = new boolean[MAX_N];
            isUsed[i] = true;
            boolean isAnswer = true;

            for(int j = 0; j < n - 1; j ++) {
                ans[j + 1] = Math.abs(arr[j] - ans[j]);
                isUsed[ans[j + 1]] = true;
            }

            for(int j = 1; j <= n; j ++) {
                if(!isUsed[j]) isAnswer = false;
            }

            if(isAnswer) {
                for(int j = 0; j < n; j ++) {
                    System.out.print(ans[j] + " ");
                }
                break;
            }
            /*else {
                for(int j = 0; j < n; j ++) {
                    System.out.print(isUsed[j] + " ");
                }
                System.out.println();
            }*/
        }
    }
}