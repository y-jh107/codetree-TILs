import java.util.*;

public class Main {
    public static int MAX_N = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans = 0;
        int[] nums = new int[n];

        for(int i = 0; i < n; i ++) {
            nums[i] = sc.nextInt();
        }

        for(int i = 1; i <= MAX_N; i ++) {
            for(int j = 0; j < n; j ++) {
                int same = Math.abs(i - nums[j]);
                for(int k = j + 1; k < n; k ++) {
                    int isSame = Math.abs(i - nums[k]);

                    if(same == isSame) ans ++;
                }
            }
        }

        System.out.println(ans);
    }
}