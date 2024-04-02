import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(), str2 = sc.next();
        char[] arr1 = str1.toCharArray(), arr2 = str2.toCharArray();

        if(arr1.length != arr2.length) System.out.println("No");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < arr1.length; i ++) {
            if(arr1[i] != arr2[i]) {
                System.out.println("No");
                break;
            }

            if(i == arr1.length - 1) System.out.println("Yes");
        }

    }
}