import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] arr = new char[n];

        for(int i = 0; i < n; i ++) {
            arr[i] = str.charAt(i);
        }

        int ans = 0;

        for(int i = 0; i < n; i ++) {
            
            for(int j = i + 1; j < n; j ++) {
                if(arr[i] == arr[j]) {
                    int idx = j - i;
                    //System.out.println(idx);
                    int cnt = 0;
                    for(int k = 0; k < n - j; k ++) {
                        if(arr[i + k] == arr[j + k]) {
                            //System.out.println(arr[i + k] + " " + arr[j + k] + " " + cnt);
                            cnt ++;
                        }
                    }
                    //System.out.println();
                    ans = Math.max(ans, cnt);
                }
            }

        }

        System.out.println(ans);
    }
}