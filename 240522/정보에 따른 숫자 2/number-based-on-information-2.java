import java.util.*;

public class Main {
    public static int MAX_N = 1000;
    public static char[] line = new char[MAX_N];

    public static boolean findSpecial(int curr) {
        int d1 = MAX_N, d2 = MAX_N;
        for(int i = 0; i < MAX_N; i ++) {
            if(line[i] == 'S') {
                d1 = Math.min(d1, Math.abs(curr - i));
            }
            else if(line[i] == 'N') {
                d2 = Math.min(d2, Math.abs(curr - i));
            }
        }

        if(d1 <= d2) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        int ans = 0;

        for(int i = 0; i < t; i ++) {
            char alpha = sc.next().charAt(0);
            int place = sc.nextInt();

            line[place] = alpha;
        }

        for(int i = a; i <= b; i ++) {
            if(findSpecial(i)) ans ++;
        }

        System.out.println(ans);
    }
}