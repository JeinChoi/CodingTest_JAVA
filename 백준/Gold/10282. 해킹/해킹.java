import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node implements Comparable<Node> {

    public int to;
    public int weight;

    @Override
    public int compareTo(Node o) {
        return this.weight - o.weight;
    }

    public Node(
            int end,
            int weight
    ) {
        this.to = end;
        this.weight = weight;
    }
}
class Main {
    static List<Node>[] nodes;
    static boolean[] visited;
    static Integer[] distance; // 최단거리 행렬

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        var br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for(int k=0;k<testcase;k++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());

            nodes = new ArrayList[v + 1];
            visited = new boolean[v + 1];
            distance = new Integer[v + 1];

            for (int i = 0; i <= v; i++) {
                nodes[i] = new ArrayList<>();
                distance[i] = Integer.MAX_VALUE;
            }

            for (int i = 0; i < e; i++) {
                String[] edge = br.readLine().split(" ");

                int to = Integer.parseInt(edge[0]);
                int from = Integer.parseInt(edge[1]);
                int weight = Integer.parseInt(edge[2]);

                nodes[from].add(new Node(to, weight));
            }
     
            dijkstra(start);

            Arrays.sort(distance, Collections.reverseOrder());

            boolean flag=true; int max=0;
            int num=0;
            for (int i = 0; i < distance.length; i++) {
                if (distance[i] == Integer.MAX_VALUE)
                    continue;
                else {
                    num++;
                    if(flag){
                        flag=false;
                        max=i;
                    }
                }
            }
            sb.append(num).append(" ").append(distance[max]).append("\n");
        }
        System.out.println(sb);

    }

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        distance[start] = 0;//자기 자신과의 거리는 0이다.
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            visited[cur.to] = true;

            for (Node node : nodes[cur.to]) {
                if (visited[node.to])
                    continue;

                if (distance[cur.to] + node.weight < distance[node.to]) {
                    distance[node.to] = distance[cur.to] + node.weight;
                    pq.offer(new Node(node.to, distance[node.to]));

                }
            }
        }
    }
}