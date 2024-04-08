import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] check;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        check = new int[vertex+1];

        for(int i =0; i < vertex+1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        for(int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }


        bfs(startVertex);
        for(int i=1;i<check.length;i++){
            System.out.println(check[i]);
        }
    }

    private static void bfs(int vertex) {
        int count=1;
        Queue<Integer> queue = new LinkedList<>();

        check[vertex]=count++;
        queue.offer(vertex);

            while(!queue.isEmpty()){
                int delete = queue.poll();
                for(int j=0;j<graph.get(delete).size();j++){
                    int newVertex = graph.get(delete).get(j);

                    if(check[newVertex]==0) {

                        check[newVertex] = count++;
                        queue.offer(newVertex);

                    }
                }
            }

    }
}