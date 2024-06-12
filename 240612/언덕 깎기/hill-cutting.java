import java.util.*;

public class Main {
    public static int MAX_N = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] hill = new int[n];

        for(int i = 0; i < n; i ++) {
            hill[i] = sc.nextInt();
        }

        Arrays.sort(hill);

        int ans = Integer.MAX_VALUE;

        /*for(int i = 0; i < n; i ++) {
            for (int j = i + 1; j < n; j++) {
                if (hill[j] - hill[i] > 17) {
                    break;
                }

                int start = hill[i];
                int end = hill[j];
                int cost = 0;

                for (int k = 0; k < n; k++) {
                    if (hill[k] < start) {
                        cost += Math.pow(start - hill[k], 2);
                    } else if (hill[k] > end) {
                        cost += Math.pow(hill[k] - end, 2);
                    }
                }

                ans = Math.min(ans, cost);
            }
        }*/

        for (int start = 0; start <= 83; start++) {
            int end = start + 17;
            int cost = 0;

            for (int i = 0; i < n; i++) {
                if (hill[i] < start) {
                    cost += Math.pow(start - hill[i], 2); // 언덕 높이가 구간의 시작보다 낮으면 올리는 비용을 계산합니다.
                } else if (hill[i] > end) {
                    cost += Math.pow(hill[i] - end, 2); // 언덕 높이가 구간의 끝보다 높으면 깎는 비용을 계산합니다.
                }
            }

            ans = Math.min(ans, cost); // 최소 비용을 갱신합니다.
        }

        System.out.println(ans);
    }
}