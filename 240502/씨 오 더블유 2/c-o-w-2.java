import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        String str = sc.next();
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length - 2; i ++) {
            if(arr[i] == 'C') {
                for(int j = i + 1; j < arr.length - 1; j ++) {
                    if(arr[j] == 'O') {
                        for(int k = j + 1; k < arr.length; k ++) {
                            if(arr[k] == 'W')
                                cnt ++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}