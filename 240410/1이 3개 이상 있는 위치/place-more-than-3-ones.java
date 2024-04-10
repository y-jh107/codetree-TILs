import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j ++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j ++) {
                    int cntOne = 0;
                    if (i - 1 >= 0 && matrix[i - 1][j] == 1)
                        cntOne ++;
                    if (i + 1 < n && matrix[i + 1][j] == 1 )
                        cntOne ++;
                    if (j - 1 >= 0 && matrix[i][j - 1] == 1)
                        cntOne ++;
                    if (j + 1 < n && matrix[i][j + 1] == 1)
                        cntOne ++;

                    if (cntOne >= 3) {
                        //System.out.println(i + " " + j);
                        cnt ++;
                    }
            }
        }

        System.out.println(cnt);
    }
}