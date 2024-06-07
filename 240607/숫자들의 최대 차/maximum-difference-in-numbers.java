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

        for(int i = 0; i < n; i ++) {
            int idx = 0;
            int[] arr = new int[n];             // 가능한 경우를 따져보기 위한 배열
            arr[idx ++] = nums[i];              // 첫 번째를 현재 숫자로 넣어둠

            for(int j = 0; j < n; j ++) {
                if(j == i) continue;

                boolean canPut = true;
                int toPut = nums[j], currMax = 0, currMin = MAX_NUM;            // 넣고 싶은 숫자

                for(int l = 0; l < arr.length; l ++) {      
                    /* arr 배열 안에 있는 수와 비교해서 k보다 큰 값이 있으면
                    넣을 수 없으니 canPut을 false로 하고 빠져나온다  */
                    if(arr[l] == 0) continue;
                    if(arr[l] > currMax) currMax = arr[l];
                    if(arr[l] < currMin) currMin = arr[l];
                }

                if(toPut > currMax) currMax = toPut;
                if(toPut < currMin) currMin = toPut;

                //System.out.println("toput: " + toPut + " currMax: " + currMax + " currMin: " + currMin);
                
                if(Math.abs(currMax - currMin) > k) canPut = false;

                if(canPut) arr[idx ++] = toPut;
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