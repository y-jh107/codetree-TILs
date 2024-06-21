import java.util.*;

public class Main {
    public static int MAX_N = 100;
    public static int n;
    public static int[] a = new int[MAX_N + 1];
    public static int[] b = new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i = 0; i < n; i ++) 
            a[i] = sc.nextInt();
        
        for(int i = 0; i < n; i ++) 
            b[i] = sc.nextInt();
        
        int ans = 0;
        int[] tempA = new int[n];

        for(int i = 0; i < n; i ++) {
            tempA[i] = a[i];
        }

        for(int i = 0; i < n - 1; i ++) {
            if(tempA[i] != b[i]) {
                int diff = tempA[i] - b[i];
                //System.out.println(tempA[i] + " " + b[i]);

                tempA[i + 1] += diff;
                tempA[i] -= diff;

                ans += diff;
            }

            //System.out.println(tempA[i]);
        }

        System.out.println(ans);
    }
}