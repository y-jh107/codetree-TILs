import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for(int i = 0; i < n; i ++) {
            for(int j = i; j < n; j ++) {
                int sum = 0, cntNum = 0;
                double avg = 0;
                for(int k = i; k <= j; k ++) {
                    //System.out.print(arr[k] + " + ");
                    sum += arr[k];
                    cntNum ++;
                }
                //System.out.println();
                avg = sum / cntNum;
                //System.out.println(sum + " / " + cntNum + " = " + avg);
                for(int k = i; k <= j; k ++) {
                    if(arr[k] == avg && sum % cntNum == 0) {
                        //System.out.println(arr[k]);
                        cnt ++;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}