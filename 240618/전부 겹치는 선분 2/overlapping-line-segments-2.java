import java.util.*;

public class Main {
    public static int MAX_N = 100;
    public static int n;
    public static int[][] line = new int[MAX_N][2];

    public static boolean isColapsed(int x1, int x2) {
        boolean colapse = true;

        //System.out.println(x1 + " " + x2);

        for(int i = 0; i < n; i ++) {
            if(line[i][0] == x1 && line[i][1] == x2) continue;

            for(int j = 0; j < n; j ++) {
                if(j == i || (line[j][0] == x1 && line[j][1] == x2)) continue;

                if(line[i][0] > line[j][1] || line[i][1] < line[j][0]){
                    //System.out.println(line[i][0] + " " + line[i][1] + " " + line[j][0] + " " + line[j][1]);
                    colapse = false;
                    break;
                }
            }

            if(!colapse) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i = 0; i < n; i ++) {
            line[i][0] = sc.nextInt();
            line[i][1] = sc.nextInt();
        }
        
        boolean flag = false;
        for(int i = 0; i < n; i ++) {
            if(isColapsed(line[i][0], line[i][1])) {
                System.out.println("Yes");
                flag = true;
                break;
            }
        }

        if(!flag) System.out.println("No");
    }
}