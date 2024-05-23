import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt();
        int ans = 0;

        for(int i = x; i <= y; i ++) {
            int[] nums = new int[7];
            int idx = 0, num = i;
            boolean felin = false;

            while(num > 0) {
                nums[idx ++] = num % 10;
                num /= 10; 
            }

            for(int j = 0; j < idx; j ++) {
                if(nums[j] != nums[idx - j - 1]) {
                    felin = false;
                    break;
                }

                felin = true;
            }

            if(felin) ans ++;
        }

        System.out.println(ans);
    }
}