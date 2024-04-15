import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Node{

    public int to;
    public int cows;


    public Node(int to,int cows){
        this.to=to;
        this.cows=cows;
    }


}
//to를 기준으로 큐에 저장한다
//
public class Main {
    static ArrayList<ArrayList<Node>> nodes = new ArrayList<>();
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int vertex = Integer.parseInt(st.nextToken());//정점
        int edges = Integer.parseInt(st.nextToken());//간선

        distance=new int[vertex+1];

        for(int i=0;i<=vertex;i++){
            distance[i]=Integer.MAX_VALUE;
            nodes.add(new ArrayList<>());
        }
        for(int i=0;i<edges;i++) {
            st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cows = Integer.parseInt(st.nextToken());

            nodes.get(from).add(new Node(to, cows));
            nodes.get(to).add(new Node(from,cows));
        }

        dijkstra(1);
        System.out.println(distance[vertex]);

    }
    public static void dijkstra(int start){
    PriorityQueue<Node> pq = new PriorityQueue<>((o1,o2)->o1.cows-o2.cows);
    distance[start]=0;
    pq.offer(new Node(start,0));

    while(!pq.isEmpty()){
        Node now = pq.poll();

        for(Node node : nodes.get(now.to)){
            if(distance[now.to]+node.cows<distance[node.to]){
                distance[node.to] = distance[now.to]+node.cows;
                 pq.offer(new Node(node.to,distance[node.to]));

            }
        }
    }
    }
}
