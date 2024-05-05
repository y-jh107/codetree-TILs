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
        Arrays.sort(beauty);

        for(int i = 0; i <= n - m; i ++) {
            int cntNum = 0;
            int[] inside = new int[m];

            for(int j = 0; j < m; j ++) {
                inside[j] = arr[i + j];
            }

            Arrays.sort(inside);

            for(int j = 0; j < m; j ++) {
                if(inside[j] == beauty[j]) cntNum ++;
            }
            
            if(cntNum == m) cnt ++;
        }

        System.out.println(cnt);
    }
}