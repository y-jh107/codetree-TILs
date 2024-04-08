import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] square = new int[2001][2001];

        for(int i = 1; i <= 2; i ++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt();
            int x2 = sc.nextInt(), y2 = sc.nextInt();

            x1 += 1000;
            y1 += 1000;
            x2 += 1000;
            y2 += 1000;

            for(int j = x1; j < x2; j ++) {
                for(int k = y1; k < y2; k ++) {
                    square[j][k] = i;
                }
            }
        }

        int minX = 2000, minY = 2000, maxX = 0, maxY = 0;
        for(int i = 0; i < square.length; i ++) {
            for(int j = 0; j < square[i].length; j ++) {
                if(square[i][j] == 1 && i < minX) {
                    minX = i;
                }
                if(square[i][j] == 1 && j < minY) {
                    minY = j;
                }
                if(square[i][j] == 1 && i > maxX) {
                    maxX = i;
                }
                if(square[i][j] == 1 && j > maxY) {
                    maxY = j;
                }
            }
        }
        //System.out.println(maxX + " " + maxY + " " + minX + " " + minY);
        int sum = 0;
        for(int i = minX; i <= maxX; i ++) {
            for(int j = minY; j <= maxY; j ++) {
                sum ++;
            }
        }

        /*for(int i = 0; i < square.length; i ++) {
            for(int j = 0; j < square[i].length; j ++) {
                if(square[i][j] == 2) System.out.println(i + " " + j);
            }
        }*/

        System.out.println(sum);
    }
}