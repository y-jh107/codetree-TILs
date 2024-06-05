import java.util.*;

public class Main {
    public static int MAX_N = 20;
    public static int[] chairs = new int[MAX_N + 1];

    public static int closestSeats(int[] arr) {
        int countZero = 0, closest = MAX_N;

        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] == 1) {
                if(arr[i + 1] == 1) return 0;
                for(int j = i + 1; j < arr.length; j ++) {
                    if(arr[j] == 1) {
                        countZero = j - i - 1;
                        break;
                    }
                }
            }

            closest = Math.min(closest, countZero);
        }

        return closest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans = 0;
        String seats = sc.next();

        for(int i = 0; i < n; i ++) {
            chairs[i] = seats.charAt(i) - 48;
        }

        for(int i = 0; i < n; i ++) {
            int[] newArray = new int[n];

            for(int j = 0; j < n; j ++) {
                if(i == j) newArray[j] = 1;
                else newArray[j] = chairs[j];
            }

            /*for(int j = 0; j < n; j ++) {
                System.out.print(newArray[j] + " ");
            }
            System.out.println();*/

            int close = closestSeats(newArray);
            //System.out.println(close);

            ans = Math.max(ans, close);
        }

        System.out.println(ans);
    }
}