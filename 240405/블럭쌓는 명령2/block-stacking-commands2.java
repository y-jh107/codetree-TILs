import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] cleaned = new int[n];

        for(int i = 0; i < k; i ++) {
            int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
            for(int j = a; j <= b; j ++) {
                cleaned[j] += 1;
            }
        }

        int max = 0;
        for(int i = 0; i < n; i ++) {
            if(cleaned[i] >= max) max = cleaned[i];
        }

        System.out.println(max);
    }
}