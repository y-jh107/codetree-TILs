import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String T = sc.next();
        String[] arr = new String[n];

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr);
        
        int cnt = 0;
        for(int i = 0; i < n; i ++) {
            String str = arr[i].substring(0, T.length());
            if(str.equals(T)) {
                cnt ++;
                //System.out.println(i + " " + cnt);
            }

            if(cnt == k) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}