import java.util.*;

public class Main {
    public static int MAX_N = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();
        int[] nums = new int[n];
        int ans = 0;

        for(int i = 0; i < n; i ++) {
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i ++) {
            int idx = 0;
            int[] arr = new int[n];
            arr[idx ++] = nums[i];

            for(int j = 0; j < n; j ++) {
                if(j == i) continue;

                boolean canPut = false;

                for(int l = 0; l < arr.length; l ++) {
                    if(Math.abs(nums[j] - arr[l]) > k) {
                        break;
                    }
                    canPut = true;
                }

                if(canPut) arr[idx ++] = nums[j];
            }

            /*for(int l = 0; l < arr.length; l ++) {
                System.out.print(arr[l] + " ");
            }
            System.out.println();*/

            ans = Math.max(ans, idx);
        }

        System.out.println(ans);
    }
}