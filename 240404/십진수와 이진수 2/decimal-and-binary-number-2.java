import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        int[] dec = new int[20], tobin = new int[20];

        for(int i = 0; i < bin.length(); i ++) {
            String n = bin.substring(i,i + 1);
            dec[i] = Integer.parseInt(n);
        }

        int num = 0;
        for(int i = 0; i < bin.length(); i ++) {
            num = num * 2 + dec[i];
        }

        num *= 17;
        int index = 0;
        while (true) {
            if(num < 2) {
                tobin[index ++] = num;
                break;
            }

            tobin[index ++] = num % 2;
            num /= 2;
        }

        for(int i = index - 1; i >= 0; i --) {
            System.out.print(tobin[i]);
        }
    }
}