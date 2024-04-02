import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
            if(i % 2 == 0) {
                int[] newArray = new int[i + 1];
                for(int j = 0; j < i + 1; j ++) {
                    newArray[j] = arr[j];
                }
                Arrays.sort(newArray);
                System.out.print(newArray[i / 2] + " ");
            }
        }
    }
}