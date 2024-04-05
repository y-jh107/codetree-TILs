import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n * 2];

        for(int i = 0; i < n; i ++) {
            int x1 = sc.nextInt(), x2 = sc.nextInt();
            if(x1 < 0 || x2 < 0) {
                x1 += n - 1;
                x2 += n - 1;
            }
            for(int j = x1; j < x2; j ++) {
                arr[j] += 1;
            }
        }

        int max = 0;
        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] >= max) max = arr[i];
        }

        System.out.println(max);
    }
}