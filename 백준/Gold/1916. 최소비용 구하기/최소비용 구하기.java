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
            int cost
    ) {
        this.to = end;
        this.weight = cost;
    }
}
class Main {
    static List<Node>[] nodes;
    static boolean[] visited;
    static int[] distance; // 최단거리 행렬

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        int v = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        nodes = new ArrayList[v + 1];
        visited = new boolean[v + 1];
        distance = new int[v + 1];


        for (int i = 0; i <= v; i++) {
            nodes[i] = new ArrayList<>();
            distance[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < e; i++) {
            String[] edge = br.readLine().split(" ");

            int from = Integer.parseInt(edge[0]);
            int to = Integer.parseInt(edge[1]);
            int weight = Integer.parseInt(edge[2]);

            nodes[from].add(new Node(to, weight));
        }

        String[] require = br.readLine().split(" ");
        int requireStart = Integer.parseInt(require[0]);
        int requireEnd = Integer.parseInt(require[1]);

        dijkstra(requireStart);

        var sb = new StringBuilder();
        sb.append(distance[requireEnd]);
        System.out.println(sb);
        //            for(int i=1;i<=v;i++){//정점 개수
//                if(distance[i]==Integer.MAX_VALUE){
//                    sb.append("INF").append("\n");
//                }else{
//                    sb.append(distance[i]).append("\n");
//                }
//            }
//            System.out.println(sb);
    }

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        distance[start] = 0;
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();//최소 가중치를 가진 노드
      //      visited[cur.to] = true;
           // System.out.println("cur.to ::: "+cur.to);
            if(cur.weight>distance[cur.to])
                continue;
            for (Node node : nodes[cur.to]) {
                //System.out.println("node.to ::: "+node.to);
        //        if (visited[node.to]) {
         //           continue;
          //      }

                if (distance[cur.to] + node.weight < distance[node.to]) {
                    distance[node.to] = distance[cur.to] + node.weight;
                    pq.offer(new Node(node.to, distance[node.to]));
                }
            }
        }
    }
}