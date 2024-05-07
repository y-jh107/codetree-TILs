import java.util.*;

public class Main {
    public static final int MAX_N = 100;
    public static char[] line = new char[MAX_N + 1];
    public static int[] pos = new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxSize = 0;

        for(int i = 0; i < n; i ++) {
            int idx = sc.nextInt();
            pos[i] = idx;
            line[idx] = sc.next().charAt(0);
        }

        Arrays.sort(pos, 0, n);

        for(int i = 0; i < n; i ++) {
            int countG = 0, countH = 0;

            if(line[pos[i]] == 'G') countG ++;
            else if(line[pos[i]] == 'H') countH ++;

            for(int j = i + 1; j < n; j ++) {
                if(line[pos[j]] == 'G') countG ++;
                else if(line[pos[j]] == 'H') countH ++;

                if(countH == countG) {
                    maxSize = Math.max(maxSize, pos[j] - pos[i]);
                }      
                else if(countG != 0 && countH == 0) {
                    maxSize = Math.max(maxSize, pos[j] - pos[i]);
                }
                else if(countH != 0 && countG == 0) {
                    maxSize = Math.max(maxSize, pos[j] - pos[i]);
                }
            }
        }

        if(n == 1) maxSize = 0;
        System.out.println(maxSize);
    }
}