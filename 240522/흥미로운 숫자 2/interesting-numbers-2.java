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
            int first = nums[0], cntNum = 0;
            int[] checkedNum = new int[10];
            for(int j = 0; j < idx; j ++) {
                checkedNum[nums[j]] ++;
                if(checkedNum[nums[j]] == 1) cntNum ++;
            }

            if(cntNum == 2) {
                cnt ++;
                //System.out.println(i);
            }
        }

        System.out.println(cnt);
    }
}