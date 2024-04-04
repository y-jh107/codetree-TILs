import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), index = 0;
        int[] digit = new int[30];

        while(n > 0) {
            digit[index++] = n % 2;
            n /= 2;
        }

        for(int i = index - 1; i >= 0; i --) {
            System.out.print(digit[i]);
        }
    }
}