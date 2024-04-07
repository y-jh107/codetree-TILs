import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), current = 10000;
        int[] cntB = new int[20001];
        int[] cntW = new int[20001]; //방문 횟수를 저장한 배열
        String[] colors = new String[20001]; // 다 끝나고 색을 저장하는 배열
        String[] dirs = new String[20001]; //움직일때 색을 저장하는 배열

        for(int i = 0; i < n; i ++) {
            int x = sc.nextInt();
            String dir = sc.next();
            //System.out.println(current);

            if(dir.equals("R")) {
                while(x-- > 0) {
                    dirs[current] = "B";
                    cntB[current] ++;
                    current ++;
                    if(x == 0) current --;
                }
                //System.out.println(current);
            }

            else if(dir.equals("L")) {
                while(x -- > 0){
                    dirs[current] = "W";
                    cntW[current] ++;
                    current --;
                    if(x == 0) current ++;
                }   
                //System.out.println(current);
            }
        }

        for(int i = 0; i < colors.length; i ++) {
            if(dirs[i] == null) continue;

            if(cntB[i] >= 2 && cntW[i] >= 2) colors[i] = "G";
            else if(dirs[i].equals("B")) colors[i] = "B";
            else if(dirs[i].equals("W")) colors[i] = "W";
        }

        int w = 0, b = 0, g = 0;
        for(int i = 0; i < colors.length; i ++) {
            if(colors[i] == null) continue;

            if(colors[i].equals("W")) {
                w ++;
                //System.out.println(colors[i] + " " + i);
            }
            else if(colors[i].equals("B")) {
                b ++;
                //System.out.println(colors[i] + " " + i);
            }
            else if(colors[i].equals("G")) {
                g ++;
                //System.out.println(colors[i] + " " + i);
            }
        }

        System.out.println(w + " " + b + " " + g);
    }
}