import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = sc.nextInt(), index = 0;
        int[] arr = new int[20];

        if(b == 4) {
            while(true) {
                if(n < 4) {
                    arr[index ++] = n;
                    break;
                }

                arr[index ++] = n % 4;
                n /= 4;
            }
        }
        else if(b == 8) {
            while(true) {
                if(n < 8) {
                    arr[index ++] = n;
                    break;
                }

                arr[index ++] = n % 8;
                n /= 8;
            }
        }

        for(int i = index - 1; i >= 0; i --) {
            System.out.print(arr[i]);
        }
    }
}