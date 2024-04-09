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
                A_point[indexA ++] = v;
            }
        }

        for(int i = 0; i < m; i ++) {
            int v = sc.nextInt(), t = sc.nextInt();

            while(t -- > 0) {
                B_point[indexB ++] = v;
            }
        }

        int cnt = 0;
        for(int i = 1; i < MAX_NUM; i ++) {
            if(A_point[i] < B_point[i] && A_point[i - 1] > B_point[i - 1]) cnt ++;
            else if(A_point[i] > B_point[i] && A_point[i - 1] < B_point[i - 1]) cnt ++;
        }

        System.out.println(cnt);
    }
}