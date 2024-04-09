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
        int curr = 0;
        int[] diff = new int[MAX_NUM * 1000];
        for(int i = 0; i < diff.length; i ++) {
            diff[i] = A_point[i] - B_point[i];
            if(diff[i] < 0) {
                if(-1 * curr < 0)
                    cnt ++;
            }
            else if(diff[i] > 0) {
                if(1 * curr < 0) 
                    cnt ++;
            }
            if(diff[i] != 0)
                curr = diff[i];
        }

        System.out.println(cnt);
    }
}