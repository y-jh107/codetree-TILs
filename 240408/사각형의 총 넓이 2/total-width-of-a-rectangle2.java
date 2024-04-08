import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int[][] square = new int[201][201];

        for(int i = 0; i < n; i ++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt();
            int x2 = sc.nextInt(), y2 = sc.nextInt();
           
            x1 += 100;
            x2 += 100;
            y1 += 100;
            y2 += 100;

            for(int j = x1; j < x2; j ++) {
                for(int k = y1; k < y2; k ++) {
                    square[j][k] = 1;
                    //System.out.println(j + " " + k);
                }
            }
        }

        for(int j = 0; j < square.length; j ++) {
            for(int k = 0; k < square[j].length; k ++) {
                if(square[j][k] == 1) sum ++;
            }
        }

        System.out.println(sum);
    }
}