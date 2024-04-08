import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int count=1;
    static int[] visited = new int[100001];
    static int younger;
    static Queue<Integer> queue=new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int subin=Integer.parseInt(st.nextToken());
        younger=Integer.parseInt(st.nextToken());

        if(subin==younger) {
            System.out.println(0);
            return;
        }
        bfs(subin);
    }

    private static void bfs(int place) {
        visited[place] = count;
        queue.add(place);
        int size=queue.size();
        while (true) {
            count++;
            size=queue.size();

            for (int i = 0; i < size; i++) {
                int now = queue.remove();
                visited[now] = count;
                if (now - 1 == younger || now + 1 == younger || now * 2 == younger) {
                    visited[younger]=count;
                    System.out.println(count-1);
                    return;
                }  if (now + 1 <= 100000 && visited[now + 1] == 0) {
                    visited[now + 1] = count;
                    queue.add(now + 1);
                }  if (now - 1 >= 0 && visited[now - 1] == 0) {
                    visited[now - 1] = count;
                    queue.add(now - 1);
                }  if (now * 2 <= 100000 && visited[now * 2] == 0) {
                    visited[now * 2] = count;
                    queue.add(now * 2);
                }
            }

        }
    }
}