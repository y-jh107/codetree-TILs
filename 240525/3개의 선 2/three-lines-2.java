import java.util.Scanner;

public class Main {
    public static int MAX_N = 20;  // 상한을 충분히 크게 설정
    public static int n;
    public static int[] x = new int[MAX_N];
    public static int[] y = new int[MAX_N];

    public static int checkX(int currX) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (x[i] == currX) cnt++;
        }
        return cnt;
    }

    public static int checkY(int currY) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (y[i] == currY) cnt++;
        }
        return cnt;
    }

    public static boolean checkThreeLines() {
        // x와 y 좌표에 대해서 모든 조합을 확인
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int line1 = x[i];
                    int line2 = x[j];
                    int line3 = x[k];

                    int coveredPoints = 0;
                    for (int p = 0; p < n; p++) {
                        if (x[p] == line1 || x[p] == line2 || x[p] == line3) {
                            coveredPoints++;
                        }
                    }

                    if (coveredPoints == n) {
                        return true;
                    }

                    line1 = y[i];
                    line2 = y[j];
                    line3 = y[k];

                    coveredPoints = 0;
                    for (int p = 0; p < n; p++) {
                        if (y[p] == line1 || y[p] == line2 || y[p] == line3) {
                            coveredPoints++;
                        }
                    }

                    if (coveredPoints == n) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        if (checkThreeLines()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}