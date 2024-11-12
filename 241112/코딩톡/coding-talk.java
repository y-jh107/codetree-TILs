import java.util.*;
import java.io.*;

public class Main {
    public static List<String> talk = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i ++) {
            String s = br.readLine();

            talk.add(s);
        }

        int u = talk.get(p - 1).charAt(2) - '0';
        int ans = n - u - 1, count = 0;

        Map<Character, Boolean> read = new HashMap<>();

        for (int i = 0; i < n; i ++) {
            read.put((char)('A' + i), false);
        }

        for (int i = p - 1; i < m; i ++) {
            String s = talk.get(i);
            char name = s.charAt(0);

            if (read.containsKey(name) && !read.get(name)) {
                read.replace(name, true);
                count ++;
            }
        }

        StringBuilder sb = new StringBuilder();

        if (ans == count) {
            for (Map.Entry<Character, Boolean> entry : read.entrySet()) {
                boolean isRead = entry.getValue();
                char name = entry.getKey();

                if (isRead == false) {
                    sb.append(name).append(" ");
                }
            }
        }

        System.out.println(sb);
    }
}