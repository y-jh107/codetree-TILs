import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0, maxCnt = 0;
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i ++) {
            if(i == 0 || arr[i] == arr[i - 1]) {
                //System.out.println(cnt);
                cnt ++;
                if(i == n - 1) {
                    maxCnt = cnt;
                    break;
                }
            }

            if(i > 0 && i < n - 1 && arr[i - 1] != arr[i]) {
                //System.out.println(cnt);
                maxCnt = cnt;
                cnt = 0;
            }
        }

        System.out.println(maxCnt);
    }
}