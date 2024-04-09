import java.util.*;

class Developer {
    public boolean infect;
    public int num;
    public int leftInfections;

    public Developer(int num, int left) {
        infect = false;
        this.num = num;
        this.leftInfections = left;
    }

    public void infection() {
        this.infect = true;
    }
}

public class Main {
    public static int n;
    public static int[] timeX = new int[251];
    public static int[] timeY = new int[251];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt(), p = sc.nextInt(), t = sc.nextInt();
        Developer[] d = new Developer[n];

        for (int i = 0; i < n; i ++) {
            if(i == p - 1) d[i] = new Developer(i, k);
            else d[i] = new Developer(i, 0);
        }
        
        d[p - 1].infection();

        while (t -- > 0) {
            int time = sc.nextInt();
            timeX[time] = sc.nextInt();
            timeY[time] = sc.nextInt();
            //System.out.println(time + " " + timeX[time] + " " + timeY[time]);
        }

        for (int i = 0; i < timeX.length; i ++) {
            if(timeX[i] != 0 && timeY[i] != 0) {
                if(d[timeX[i] - 1].infect) {
                    d[timeY[i] - 1].infection();
                    d[p - 1].leftInfections --;
                }
                if(d[timeY[i] - 1].infect) {
                    d[timeX[i] - 1].infection();
                    d[p - 1].leftInfections --;
                }

                if(d[p - 1].leftInfections == 0) break;
            }
        }

        for(int i = 0; i < n; i ++) {
            if(d[i].infect) System.out.print(1);
            else System.out.print(0);
        }
    }
}