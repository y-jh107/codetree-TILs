import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] developers = new int[6];
        int ans = 0, minValue = Integer.MAX_VALUE;

        for(int i = 0; i < 6; i ++) {
            developers[i] = sc.nextInt();
        }

        Arrays.sort(developers);

        int[] teams = new int[3];

        for(int l = 0; l < 3; l ++) {
            teams[l] += developers[l] + developers[5 - l];
        }

        int findMax = teams[1], findMin = teams[2];

        minValue = Math.min(minValue, Math.abs(findMax - findMin));

        System.out.println(minValue);
    }
}