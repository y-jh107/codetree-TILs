import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), current = MAX_NUM;
        String[] colors = new String[MAX_NUM * 2 + 1];

        for(int i = 0; i < n; i ++) {
            int x = sc.nextInt();
            String dir = sc.next();

            if (dir.equals("R")) {
                while(x-- > 0) {
                    colors[current] = "B";
                    if(x > 0) current ++;
                }
            }
            else if (dir.equals("L")) {
                while(x-- > 0) {
                    colors[current] = "W";
                    if(x > 0) current --;
                }
            }
        }

        int w = 0, b = 0;
        for(int i = 0; i < colors.length; i ++) {
            if(colors[i] == null) continue;
            else if(colors[i].equals("B")) b ++;
            else if(colors[i].equals("W")) w ++;
        }

        System.out.println(w + " " + b);
    }
}