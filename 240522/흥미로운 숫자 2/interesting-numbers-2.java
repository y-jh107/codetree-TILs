import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int cnt = 0;

        for(int i = x; i <= y; i ++) {
            int idx = 0, num = i;
            int[] nums = new int[10];

            //System.out.println(num);

            while(num > 0) {
                nums[idx ++] = num % 10;
                num /= 10;
            }

            //Arrays.sort(nums);
            int cntNum = 0, n = idx;
            int[] checkedNum = new int[10];

            for(int j = 0; j < idx; j ++) {
                checkedNum[nums[j]] ++;
            }

            for(int j = 0; j < 10; j ++) {
                if(checkedNum[j] != 0) {
                    if(checkedNum[j] == 1) {
                        idx --;
                    }
                    cntNum ++;
                }
            }

            if(cntNum == 2 && idx == n - 1) {
                cnt ++;
                //System.out.println(i);
            }
        }

        System.out.println(cnt);
    }
}