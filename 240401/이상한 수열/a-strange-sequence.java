import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        System.out.print(f(n));
    }
    
    public static int f(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        return f(n / 3) + f(n - 1);
    }
}