import java.util.*;

public class Main {
    public static int n;
    public static int budget;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        budget = sc.nextInt();
        int[] students = new int[n];

        for(int i = 0; i < n; i ++) {
            students[i] = sc.nextInt();
        }

        Arrays.sort(students, 0, n);
        int maxStudents = 0;
        for(int i = 0; i < n; i ++) {
            int total = 0, presents = 0;

            for(int j = 0; j < n; j ++) {
                //System.out.println(total);
                
                if(j == i) total += students[j] / 2;
                else total += students[j];
                presents ++;

                if(total > budget) {
                    presents --;
                    //System.out.println(i + " " + total + " " + presents);
                    break;
                }
            }

            //System.out.println();

            maxStudents = Math.max(maxStudents, presents); 
        }

        System.out.println(maxStudents);
    }
}