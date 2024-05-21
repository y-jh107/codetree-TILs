import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), budget = sc.nextInt();
        int[][] students = new int[n][2];

        for(int i = 0; i < n; i ++) {
            students[i][0] = sc.nextInt();
            students[i][1] = sc.nextInt();
        }

        //Arrays.sort(students, Comparator.comparingInt(a -> a[0] + a[1]));

        int result = 0;
        for(int i = 0; i < n; i ++) {
            int total = 0, ans = 0;
            for(int j = 0; j < n; j ++) {
                int sum = 0;
                if(i == j) {
                    sum = students[j][0] / 2 + students[j][1];
                    ans ++;
                }
                else {
                    sum = students[j][0] + students[j][1];
                    ans ++;
                }

                total += sum;

                if(total > budget) {
                    ans --;
                    total -= sum;
                }

                //System.out.println(total + " " + ans);
            }
           // System.out.println();
            result = Math.max(result, ans);
        }

        System.out.println(result);
    }
}