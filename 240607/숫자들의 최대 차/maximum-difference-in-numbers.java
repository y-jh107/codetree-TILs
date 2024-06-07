import java.util.*;

public class Main {
    public static int MAX_N = 1000;
    public static int MAX_NUM = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();
        int[] nums = new int[n];
        int ans = 0;

        for(int i = 0; i < n; i ++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        for(int i = 0; i < n; i ++) {
            int idx = 0;
            int[] arr = new int[n];
            arr[idx ++] = nums[i];

            for(int j = 0; j < n; j ++) {
                if(j == i) continue;

                boolean canPut = true;
                int toPut = nums[j], currMax = 0, currMin = MAX_NUM;

                for(int l = 0; l < arr.length; l ++) {
                    if(arr[l] == 0) continue;
                    if(arr[l] > currMax) currMax = arr[l];
                    if(arr[l] < currMin) currMin = arr[l];
                }

                if(toPut > currMax) currMax = toPut;
                if(toPut < currMin) currMin = toPut;

                
                if(Math.abs(currMax - currMin) > k) canPut = false;

                if(canPut) arr[idx ++] = toPut;
            }

            ans = Math.max(ans, idx);
        }

        System.out.println(ans);
    }
}