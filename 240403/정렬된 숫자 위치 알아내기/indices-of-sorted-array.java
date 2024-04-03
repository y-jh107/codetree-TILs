import java.util.*;
class Number implements Comparable<Number> {
    int n, loc, order;

    public Number(int n, int loc, int order) {
        this.n = n;
        this.loc = loc;
        this.order = order;
    }

    @Override
    public int compareTo(Number num) {
        if(this.n != num.n) {
            return this.n - num.n;
        }   
        
        //System.out.println(this.n + " " + num.n);
        return this.loc - num.loc;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number[] num = new Number[n];

        for(int i = 0; i < n; i ++) {
            num[i] = new Number(sc.nextInt(), i + 1, i);
        }

        Arrays.sort(num);

        int[] answer = new int[n + 1];

        for(int i = 0; i < n; i++) {
            answer[num[i].loc] = i + 1;
        }

        for(int i = 1; i < n + 1; i ++) {
            System.out.print(answer[i] + " ");
        }
    }
}