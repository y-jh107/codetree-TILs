import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr1 = new int[1000000];
        int[] arr2 = new int[1000000];
        int current1 = 1, current2 = 1;
        boolean check = true;

        for(int i = 0; i < n; i ++) {
            String dir = sc.next();
            int t = sc.nextInt();
            
            if(dir.equals("R")) {
                for(int j = 0; j < t; j ++){
                    arr1[current1] = arr1[current1 - 1] + 1;
                    current1 ++;
                }
            }

            else if(dir.equals("L")) {
                for(int j = 0; j < t; j ++){
                    arr1[current1] = arr1[current1 - 1] - 1;
                    current1 ++;
                }
            }
        }

        for(int i = 0; i < m; i ++) {
            String dir = sc.next();
            int t = sc.nextInt();
            
            if(dir.equals("R")) {
                for(int j = 0; j < t; j ++){
                    arr2[current2] = arr2[current2 - 1] + 1;
                    current2 ++;
                }
            }

            else if(dir.equals("L")) {
                for(int j = 0; j < t; j ++){
                    arr2[current2] = arr2[current2 - 1] - 1;
                    current2 ++;
                }
            }
        }

        for(int i = 0; i < arr1.length; i ++) {
            if(arr1[i] != 0 && arr2[i] == arr1[i]) {
                System.out.println(i);
                check = false;
                break;
            }
        }

        //System.out.println(arr1[6268] + " " + arr2[6268]);
        if(check) System.out.println(-1);
    }
}