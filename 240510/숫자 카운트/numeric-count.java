import java.util.*;

public class Main {
    public static int[] possible = new int[1000];

    public static boolean check(int num[]) {
        if(num[0] == num[1] || num[0] == num[2] || num[1] == num[2])
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0, index = 0;
        int[] ans = new int[3];
        int[] nums = new int[1000];

        for(int i = 0; i < n; i ++) {
            int num = sc.nextInt(), idx = 0, unit = 100;
            int cnt1 = sc.nextInt(), cnt2 = sc.nextInt();

            while(num > 0) {
                ans[idx ++] = num / unit;
                num %= unit;
                unit /= 10;
            }

            for(int j = 1; j <= 9; j ++) {
                for(int k = 1; k <= 9; k ++) {
                    for(int l = 1; l <= 9; l ++) {
                        int num1 = 0, num2 = 0;
                        int[] curr = {j, k, l};

                        if(!check(curr)) continue;

                        if(ans[0] == j) num1 ++;
                        else if(ans[0] == k || ans[0] == l) num2 ++;

                        if(ans[1] == k) num1 ++;
                        else if(ans[1] == j || ans[1] == l) num2 ++;

                        if(ans[2] == l) num1 ++;
                        else if(ans[2] == j || ans[2] == k) num2 ++;

                        if(num1 == cnt1 && num2 == cnt2) {
                            nums[index ++] = (100 * j + 10 * k + l);
                        }
                    }
                }
            }
        }

        for(int i = 0; i < nums.length; i ++) {
            possible[nums[i]] ++;
        }

        for(int i = 1; i <= 999; i ++) {
            if(possible[i] == n) cnt ++;
        }

        System.out.println(cnt);
    }
}