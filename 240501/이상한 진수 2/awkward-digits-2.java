import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int[] bin = new int[binary.length()];
        int[] ans = new int[binary.length()];
        int maxValue = 0;

        for(int i = 0; i < bin.length; i ++) {
            bin[i] = Character.getNumericValue(binary.charAt(i));
        }

        for(int i = 0; i < bin.length; i ++) {
            if(bin[i] == 0) {
                for(int j = 0; j < i; j ++) {
                    ans[j] = bin[j];
                }
                ans[i] = 1;
                for(int j = i + 1; j < ans.length; j ++) {
                    ans[j] = bin[j];
                }
            }

            if(bin[i] == 1) {
                for(int j = 0; j < i; j ++) {
                    ans[j] = bin[j];
                }
                ans[i] = 0;
                for(int j = i + 1; j < ans.length; j ++) {
                    ans[j] = bin[j];
                }
            }
            
            int decimal = 0, times = 1;
            for(int j = ans.length - 1; j >= 0; j --) {
                decimal += ans[j] * times;
                //System.out.println(times);
                times *= 2;
            }
            //System.out.println(" " + decimal);
            maxValue = Math.max(decimal, maxValue);
        }

        System.out.print(maxValue);
    }
}