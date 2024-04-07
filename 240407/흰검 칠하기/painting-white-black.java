import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), current = 1000;
        int[] visited = new int[2001]; //방문 횟수를 저장한 배열
        String[] colors = new String[2001]; // 다 끝나고 색을 저장하는 배열
        String[] dirs = new String[2001]; //움직일때 색을 저장하는 배열

        for(int i = 0; i < n; i ++) {
            int x = sc.nextInt();
            String dir = sc.next();

            if(dir.equals("R")) {
                for(int j = current; j < current + x; j ++) {
                    dirs[j] = "B";
                    visited[j] ++;
                    //System.out.println(j + " " + dirs[j] + " " + visited[j]);
                }
                current += x;
            }

            else if(dir.equals("L")) {
                for(int j = current - x; j < current; j ++) {
                    dirs[j] = "W";
                    visited[j] ++;
                    //System.out.println(current + " " + dirs[j] + " " + visited[j]);
                }
                current -= x;
            }
        }

        for(int i = 0; i < colors.length; i ++) {
            if(dirs[i] == null) continue;

            if(visited[i] >= 4) colors[i] = "G";
            else if(visited[i] < 4 && dirs[i].equals("B")) colors[i] = "B";
            else if(visited[i] < 4 && dirs[i].equals("W")) colors[i] = "W";
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