import java.util.Scanner;

public class Main {
    public static int MAX_P = 20;
    public static int n;
    public static int[] x = new int[MAX_P];
    public static int[] y = new int[MAX_P];

    public static boolean canCoverAllPointsWithLines(int[] lines, boolean isX) {
        int coveredPoints = 0;
        for (int i = 0; i < n; i++) {
            boolean covered = false;
            for (int j = 0; j < 3; j++) {
                if (isX && x[i] == lines[j]) {
                    covered = true;
                    break;
                } else if (!isX && y[i] == lines[j]) {
                    covered = true;
                    break;
                }
            }
            if (covered) {
                coveredPoints++;
            }
        }
        return coveredPoints == n;
    }

    public static boolean checkThreeLines() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int[] xLines = {x[i], x[j], x[k]};
                    int[] yLines = {y[i], y[j], y[k]};

                    // Check if these x lines can cover all points
                    if (canCoverAllPointsWithLines(xLines, true)) {
                        return true;
                    }

                    // Check if these y lines can cover all points
                    if (canCoverAllPointsWithLines(yLines, false)) {
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