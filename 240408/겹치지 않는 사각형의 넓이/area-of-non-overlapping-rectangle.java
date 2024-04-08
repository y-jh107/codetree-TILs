import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] square = new int[2001][2001];

        for(int i = 1; i <= 3; i ++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt();
            int x2 = sc.nextInt(), y2 = sc.nextInt();

            for(int j = x1; j < x2; j ++) {
                for(int k = y1; k < y2; k ++) {
                    square[j][k] = i;
                }
            }
        }

        int sum = 0;
        for(int i = 0; i < square.length; i ++) {
            for(int j = 0; j < square[i].length; j ++) {
                if(square[i][j] == 1 || square[i][j] == 2) sum ++;
            }
        }

        System.out.println(sum);
    }
}