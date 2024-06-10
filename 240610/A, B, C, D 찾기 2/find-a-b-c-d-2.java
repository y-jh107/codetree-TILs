import java.util.*;

public class Main {
    public static int n = 15;
    public static int[] arr = new int[n];

    public static boolean findABCD(int a, int b, int c, int d) {

        for(int i = 0; i < n; i ++) {
            if(arr[i] == a || arr[i] == b || arr[i] == c || arr[i] == d) continue;
            else if(arr[i] == a + b || arr[i] == b + c || arr[i] == c + d || arr[i] == d + a) continue;
            else if(arr[i] == a + b + c || arr[i] == a + b + d || arr[i] == a + c + d || arr[i] == b + c + d)
                continue;
            else if(arr[i] == a + b + c + d) continue;
            else return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[4];
        boolean findAns = false;
        for(int i = 0; i < n; i ++) {
            if(findAns) break;
            for(int j = 0; j < n; j ++) {
                if(j == i) continue;
                if(findAns) break;

                for(int k = 0; k < n; k ++) {
                    if(k == i || k == j) continue;
                    if(findAns) break;

                    for(int l = 0; l < n; l ++) {
                        if(l == i || l == k || l == j) continue;
                        if(findAns) break;

                        if(findABCD(arr[i], arr[j], arr[k], arr[l])) {
                            ans[0] = arr[i];
                            ans[1] = arr[j];
                            ans[2] = arr[k];
                            ans[3] = arr[l];

                            Arrays.sort(ans);
                            System.out.println(ans[0] + " " + ans[1] + " " + ans[2] + " " + ans[3]);
                            findAns = true;
                        }
                    }
                }
            }
        }
    }
}