import java.util.*;

public class Main {
    public static final int MAX_INT = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), minValue = MAX_INT;
        int[] room = new int[n];

        for(int i = 0; i < n; i ++) {
            room[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i ++) {
            int distance = 0;

            for(int j = 0; j < n; j ++) {
                if(j == i) continue;

                if(j >= i) {
                    distance += Math.abs(j - i) * room[j];
                }
                else {
                    distance += ((n - i) + j) * room[j];
                }
                //System.out.println(distance);
            }
            //.out.println();
            minValue = Math.min(minValue, distance);
        }

        System.out.println(minValue);
    }
}