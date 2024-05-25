import java.util.*;

public class Main {
    public static int MAX_N = 10;
    public static int MAX_P = 20;
    public static int n;
    public static int[] x = new int[MAX_P];
    public static int[] y = new int[MAX_P];

    public static int checkX(int currX) {
        int cnt = 0;

        for(int i = 0; i < MAX_N; i ++) {
            if(x[i] == currX) cnt++;
        }

        return cnt;
    }

    public static int checkY(int currY) {
        int cnt = 0;

        for(int i = 0; i < MAX_N; i ++) {
            if(y[i] == currY) cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i = 0; i < n; i ++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        boolean isTrue = false;

        for(int i = 0; i <= MAX_N; i ++) {
            for(int j = 0; j <= MAX_N; j ++) {
                for(int k = 0; k <= MAX_N; k ++) {
                    int result = 0;

                    for(int l = 0; l < 8; l ++) {
                        if(l == 0) {
                            result += checkX(i);
                            result += checkX(j);
                            result += checkX(k);
                        }

                        else if(l == 1) {
                            result += checkX(i);
                            result += checkX(j);
                            result += checkY(k);
                        }

                        else if(l == 2) {
                            result += checkX(i);
                            result += checkY(j);
                            result += checkX(k);
                        }

                        else if(l == 3) {
                            result += checkX(i);
                            result += checkY(j);
                            result += checkY(k);
                        }

                        else if(l == 4) {
                            result += checkY(i);
                            result += checkX(j);
                            result += checkX(k);
                        }

                        else if(l == 5) {
                            result += checkY(i);
                            result += checkX(j);
                            result += checkY(k);
                        }

                        else if(l == 6) {
                            result += checkY(i);
                            result += checkY(j);
                            result += checkX(k);
                        }

                        else if(l == 7) {
                            result += checkY(i);
                            result += checkY(j);
                            result += checkY(k);
                        }

                        if(result == n) {
                            isTrue = true;
                            break;
                        }
                    }
                }
            }
        }

        if(isTrue) System.out.println(1);
        else System.out.println(0);
    }
}