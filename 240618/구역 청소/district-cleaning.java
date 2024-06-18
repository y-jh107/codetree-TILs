import java.util.*;

public class Main {
    public static int MAX = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        int c = sc.nextInt(), d = sc.nextInt();

        int clean = 0;
        boolean[] visited = new boolean[MAX];

        for(int i = a; i < b; i ++) {
            visited[i] = true;
            clean +=1 ;
        }

        for(int i = c; i < d; i ++) {
            if(!visited[i]) {
                visited[i] = true;
                clean += 1;
            }
        }

        System.out.println(clean);
    }
}