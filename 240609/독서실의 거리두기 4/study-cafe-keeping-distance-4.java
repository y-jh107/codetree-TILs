import java.util.*;

public class Main {
    public static int MAX_N = 100;

    public static int findMin(int[] arr) {
        int[] full = new int[MAX_N];
        int cnt = 0, minDis = MAX_N;
        
        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] == 1) full[cnt ++] = i + 1;
        }

        for(int i = 0; i < cnt - 1; i ++) {
            int dis = full[i + 1] - full[i];
            if(dis < minDis) minDis = dis;
        }

        return minDis;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), ans = 0;
        String seats = sc.next();
        int[] seated = new int[n];

        for(int i = 0; i < n; i ++) {
            seated[i] = seats.charAt(i) - 48;
        }

        for(int i = 0; i < n; i ++) {
            if(seated[i] == 1) continue;

            int[] tempArr = new int[n];
            for(int j = 0; j < n; j ++) {
                if(i == j) tempArr[j] = 1;
                else tempArr[j] = seated[j];
            }

            /*for(int j = 0; j < n; j ++) {
                System.out.print(tempArr[j] + " ");
            }
            System.out.println();*/

            int maxDis = findMin(tempArr);

            ans = Math.max(ans, maxDis);
        }

        System.out.println(ans);
    }
}