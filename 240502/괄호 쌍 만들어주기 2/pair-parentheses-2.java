import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;
        char[] arr = str.toCharArray();

        for(int i = 0; i <= arr.length - 4; i ++) {
            for(int j = i + 2; j <= arr.length - 2; j ++) {
                if(arr[i] == '(' && arr[i + 1] == '(' && arr[j] == ')' && arr[j + 1] == ')')
                    cnt ++;
            }
        }

        System.out.println(cnt);
    }
}