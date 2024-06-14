import java.util.*;

public class Main {
    public static int MAX_N = 100;
    public static int n, l;

    public static int[] arr =  new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        l = sc.nextInt();

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        for(int i = n; i >= 0; i --) {
            int hcnt = 0, lcnt = 0;

            for(int j = 0; j < n; j ++) {
                if(arr[j] >= i)
                    hcnt ++;
                else if(arr[j] == i - 1) {
                    hcnt ++; 
                    lcnt ++;
                }
            }

            if(hcnt >= i && (lcnt - (hcnt - i) <= l)) {
                System.out.println(i);
                break;
            }
        }
    }
}