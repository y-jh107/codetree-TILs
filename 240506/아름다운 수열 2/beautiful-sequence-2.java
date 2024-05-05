import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
        int[] arr = new int[n];
        int[] beauty = new int[m];

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i ++) {
            beauty[i] = sc.nextInt();
        }

        for(int i = 0; i <= n - m; i ++) {
            int cntNum = 0;
            for(int j = i; j < i + m; j ++) {
                int isIn = arr[j];
                for(int k = 0; k < m; k ++) {
                    if(isIn == beauty[k]) cntNum ++;
                }
            }
            if(cntNum == m) cnt ++;
        }

        System.out.println(cnt);
    }
}