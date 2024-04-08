import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] square = new int[201][201];

        for(int i = 0; i < n; i ++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt();
            x1 += 100;
            y1 += 100;

            for(int j = x1; j < x1 + 8; j ++) {
                for(int k = y1; k < y1 + 8; k ++) {
                    square[j][k] = 1;
                }
            }
        }

        int sum = 0;
        for(int i = 0; i < square.length; i ++) {
            for(int j = 0; j < square[i].length; j ++) {
                if(square[i][j] == 1) sum ++;
            }
        }

        System.out.println(sum);
    }
}