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
            int cnt = 0;
            for(int j = 0; j < n; j ++) {
                int num1 = nums[j] - i;
                for(int k = j + 1; k < n; k ++) {
                    int num2 = nums[k] - i;
                    if(Math.abs(num1) == Math.abs(num2)) {
                        cnt ++;
                        //System.out.println(nums[j] + " " + i + " " + nums[k]);
                        break;
                    }
                }
            }

            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}