import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int[] toDec = new int[20], toNum = new int[20];
        int num = 0, index = 0;
        String s = sc.next();
        
        for(int i = 0; i < s.length(); i ++) {
            String x = s.substring(i, i + 1);

            toDec[i] = Integer.parseInt(x); 
        }

        for(int i = 0; i < s.length(); i ++) {
            num = num * a + toDec[i];
        }

        while (true) {
            if(num < b) {
                toNum[index ++] = num;
                break;
            }

            toNum[index ++] = num % b;
            num /= b;
        }

        for(int i = index - 1; i >= 0; i --) {
            System.out.print(toNum[i]);
        }
    }
}