import java.util.*;

public class Main {
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[2 * n];

        for(int i = 0; i < 2 * n; i ++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int[] result = new int[n];
        for(int i = 0; i < n; i ++) {
            result[i] = arr[2 * n - 1 - i] + arr[i];
        }

        System.out.println(findMax(result));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        
        for(int i = 1; i < n; i ++) {
            if(max < arr[i]) max = arr[i];
        }

        return max;
    }
}