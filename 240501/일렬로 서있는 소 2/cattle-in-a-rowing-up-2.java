import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        int[] cows = new int[n];

        for(int i = 0; i < n; i ++) {
            cows[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 2; i ++) {
            for(int j = i + 1; j < n - 1; j ++) {
                if(cows[i] < cows[j])
                    for(int k = j + 1; k < n; k ++) {
                        if(cows[j] < cows[k])
                            cnt ++;
                    }
            }
        }

        System.out.println(cnt);
    }
}