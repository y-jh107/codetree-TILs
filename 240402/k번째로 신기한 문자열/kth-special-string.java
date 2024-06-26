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
        
        int cnt = 0, index = 0;
        for(int i = 0; i < n; i ++) {
            if(T.length() > arr[i].length()) continue;
            String str = arr[i].substring(0, T.length());
            if(str.equals(T)) {
                cnt ++;
                index = i;
            }

            if(cnt == k) {
                break;
            }
        }

        System.out.println(arr[index]);
    }
}