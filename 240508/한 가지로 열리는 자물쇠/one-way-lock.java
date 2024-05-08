import java.util.Scanner;

public class Main {
    public static int firstKey, secondKey, thirdKey;
    public static boolean inRange(int x, int y) {
        return (x >= y - 2 && x <= y + 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        firstKey = sc.nextInt();
        secondKey = sc.nextInt();
        thirdKey = sc.nextInt();

        for(int i = 1; i <= n; i ++) {
            for(int j = 1; j <= n; j ++) {
                for(int k = 1; k <= n; k ++) {
                    if((i >= firstKey -2 && i <= firstKey + 2) || (j >= secondKey -2 && j <= secondKey + 2) || (k >= thirdKey -2 && k <= thirdKey + 2))
                        cnt ++;
                }
            }
        }

        System.out.println(cnt);
    }
}