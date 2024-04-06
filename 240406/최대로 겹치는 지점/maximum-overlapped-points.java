import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] check = new int[100];

        while(n > 0) {
            int x1 = sc.nextInt(), x2 = sc.nextInt();
            for(int i = x1; i <= x2; i ++) {
                check[i] ++;
            }

            n --;
        }
        
        int max = 0;
        for(int i = 0; i < 100; i ++) {
            if(check[i] > max) max = check[i];
        }

        System.out.println(max);
    }
}