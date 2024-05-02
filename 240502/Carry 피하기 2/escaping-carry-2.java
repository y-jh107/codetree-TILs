import java.util.*;

public class Main {
    public static int[] makeArray(int n) {
        int[] arr = new int[5];
        int index = 0;
        while(n > 0) {
            arr[index ++] = n % 10;
            n /= 10;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxValue = 0;
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 2; i ++) {
            boolean isTrue = false;
            int[] num1 = makeArray(arr[i]);

            for(int j = i + 1; j < n - 1; j ++) {
                int[] num2 = makeArray(arr[j]);

                for(int k = j + 1; k < n; k ++) {
                    int[] num3 = makeArray(arr[k]);

                    for(int l = 0; l < 5; l ++) {
                        if(num1[l] + num2[l] + num3[l] > 10) {
                            isTrue = false;
                            break;
                        }
                        isTrue = true;
                    }

                    if(isTrue) {
                        int sum = arr[i] + arr[j] + arr[k];
                        maxValue = Math.max(maxValue, sum);
                    }
                }
            }
        }
        
        System.out.println(maxValue);
    }
}