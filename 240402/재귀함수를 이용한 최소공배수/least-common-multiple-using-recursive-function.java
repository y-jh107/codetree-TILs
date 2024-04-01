import java.util.Scanner;

public class Main {
    public static int result = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i ++) {
            int g = gcd(arr[i], result);
            result = (arr[i] * result) / g;
        }

        System.out.print(result);
    }

    public static int gcd(int a, int b) {
        int r = 0;
        if(a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while(b != 0) {
            r = a % b;
            a = b;
            b = r;
            //.out.println(a);
        }
        return a;
    }
}