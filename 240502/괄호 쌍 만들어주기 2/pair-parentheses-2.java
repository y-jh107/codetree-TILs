import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;

        for(int i = 0; i < str.length() - 1; i ++) {
            if(str.charAt(i) == str.charAt(i + 1))
                cnt ++;
        }

        System.out.println(cnt);
    }
}