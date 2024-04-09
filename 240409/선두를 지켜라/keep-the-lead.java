import java.util.Scanner;

public class Main {
    public static int MAX_NUM = 1000;
    public static int[] A_point = new int[MAX_NUM * 1000];
    public static int[] B_point = new int[MAX_NUM * 1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int indexA = 1, indexB = 1;

        for(int i = 0; i < n; i ++) {
            int v = sc.nextInt(), t = sc.nextInt();

            while(t -- > 0) {
                A_point[indexA] = A_point[indexA - 1] + v;
                indexA ++;
            }
        }

        for(int i = 0; i < m; i ++) {
            int v = sc.nextInt(), t = sc.nextInt();

            while(t -- > 0) {
                B_point[indexB] = B_point[indexB - 1] + v;
                indexB ++;
            }
        }

        int cnt = 0;
        int winner = 'C';

        for(int i = 0; i < indexA; i ++) {
            if(A_point[i] > B_point[i]) {
                if(winner == 'B') cnt ++;
                winner = 'A';
            }

            else if(B_point[i] > A_point[i]) {
                if(winner == 'A') cnt ++;
                winner = 'B';
            }
        }

        System.out.println(cnt);
    }
}