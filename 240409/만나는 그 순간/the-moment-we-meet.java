import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr1 = new int[1000000];
        int[] arr2 = new int[1000000];
        int current1 = 500000, current2 = 500000, stack1 = 0, stack2 = 0;
        boolean check = true;

        for(int i = 0; i < n; i ++) {
            String dir = sc.next();
            int t = sc.nextInt();
            
            if(dir.equals("R")) {
                for(int j = 0; j < t; j ++){
                    arr1[current1] = stack1;
                    current1 += 1;
                    stack1 += 1;
                }
            }

            if(dir.equals("L")) {
                for(int j = 0; j < t; j ++){
                    arr1[current1] = stack1;
                    current1 -= 1;
                    stack1 += 1;
                }
            }
        }

        for(int i = 0; i < m; i ++) {
            String dir = sc.next();
            int t = sc.nextInt();
            
            if(dir.equals("R")) {
                for(int j = 0; j < t; j ++){
                    arr2[current2] = stack2;
                    current2 += 1;
                    stack2 += 1;
                }
            }

            if(dir.equals("L")) {
                for(int j = 0; j < t; j ++){
                    arr2[current2] = stack2;
                    current2 -= 1;
                    stack2 += 1;
                }
            }
        }

        for(int i = 0; i < arr1.length; i ++) {
            if(arr1[i] != 0 && arr2[i] == arr1[i]) {
                System.out.println(arr1[i]);
                check = false;
                break;
            }
        }

        if(check) System.out.println(-1);
    }
}