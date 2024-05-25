import java.util.*;

public class Main {
    public static int MAX_N = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] points = new int[n][2];

        for(int i = 0; i < n; i ++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        boolean isTrue = false;

        for(int i = 0; i <= MAX_N; i ++) {
            for(int j = 0; j <= MAX_N; j ++) {
                for(int k = 0; k <= MAX_N; k ++) {
                    boolean canPass = true;

                    for(int l = 0; l < n; l ++) {
                        if(points[l][0] == i || points[l][0] == j || points[l][0] == k)
                            canPass = true;
                        else if(points[l][1] == i || points[l][1] == j || points[l][1] == k)
                            canPass = true;
                        else
                            canPass = false;
                    }

                    if(canPass) isTrue = true;
                }
            }
        }

        if(isTrue) System.out.println(1);
        else System.out.println(0);
    }
}