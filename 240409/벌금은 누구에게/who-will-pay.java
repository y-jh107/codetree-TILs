import java.util.Scanner;

public class Main {
    public static int MAX_NUM;
    public static int[] Students = new int[MAX_NUM + 100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MAX_NUM = sc.nextInt();
        boolean isTrue = false;

        int m = sc.nextInt(), k = sc.nextInt();
        for(int i = 0; i < m; i ++) {
            int x = sc.nextInt();
            Students[x] ++; 
            isTrue = true;

            if(Students[x] >= k) {
                System.out.println(x);
                isTrue = false;
                break;
            }
        }

        if(isTrue) System.out.println(-1);
    }
}