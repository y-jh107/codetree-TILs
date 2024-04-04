import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digit = sc.next();
        int[] digits = new int[20];

        for(int i = 0; i < digit.length(); i ++) {
            int n = Integer.parseInt(digit.substring(i, i + 1));
            digits[i] = n;
        }

        int num = 0;
        for(int i = 0; i < digit.length(); i ++) {
            num = num * 2 + digits[i];
        }

        System.out.println(num);
    }
}