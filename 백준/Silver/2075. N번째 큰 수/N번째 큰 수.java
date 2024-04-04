import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
   /*
   * 1. N개를 입력 받는다.
   * 2. 내림차순인 우선순위큐를 생성한다.
   * 3. N*N개의 숫자를 입력 받아서 우선순위 큐에 추가 한다.
   * 4. N번째로 큰 숫자를 꺼내기 위해서 큐의 첫번째 값을 N번을 삭제한다.
   * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N= Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);//내림차순 우선순위 큐 생성
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                pq.add(Integer.parseInt(st.nextToken()));
            }
        }
        for(int i=1;i<N;i++){
            pq.poll();
        }
        System.out.println(pq.poll());
    }

}
