import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), current = 100;
        int[] check = new int[200];

        while(n > 0) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir == 'R') {
                for(int i = current; i < current + x; i ++) {
                    check[i] ++;
                }

                current += x;
            }
            else if(dir == 'L') {
                for(int i = current - x; i < current; i ++) {
                    check[i] ++;
                }

                current -= x;
            }
            
            n --;
        }

        int cnt = 0;
        for(int i = 0; i < check.length; i ++) {
            if(check[i] >= 2) cnt ++;
        }
        System.out.println(cnt);
    }
}