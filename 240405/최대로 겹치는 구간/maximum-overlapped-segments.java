import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxIndex = 0, index = 0;
        int[] arr = new int[200];
        int[] check = new int[200];

        n *= 2;
        while (n > 0) {
            int x = sc.nextInt();
            check[index ++] = x;

            if(x < 0) {
                x = Math.abs(x);
                if(x > maxIndex) maxIndex = x;
            }

            n --;
        }

        //System.out.println(maxIndex);
        for(int i = 0; i < index; i ++) {
            check[i] += maxIndex;
        }

        for(int i = 0; i < index; i += 2) {
            //System.out.println(check[i] + " " + check[i + 1]);
            for(int j = check[i]; j < check[i + 1]; j ++) {
                arr[j] ++;
            }
        }

        int max = 0;
        for(int i = 0; i < 200; i ++) {
            if(arr[i] >= max) max = arr[i];
        }

        System.out.println(max);
    }
}