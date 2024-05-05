import java.util.*;

public class Main {
    public static int n, s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < n; i ++) {
            for(int j = i + 1; j < n; j ++) {
                int near = 0;
                for(int k = 0; k < n; k ++) {
                    if(k == i || k == j)
                        continue;
                    near += arr[k];
                }
                int findNear = Math.abs(s - near);
                //System.out.println(findNear);
                minValue = Math.min(minValue, findNear);
            }
        }

        System.out.println(Math.abs(minValue));
    }
}