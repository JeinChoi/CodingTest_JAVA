import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
* 예상 논리
* 1. 처음에는 무조건 첫번째 도시 가격에 맞춰서 기름을 사용해야 한다
* 2. 거기서 추가로 첫번째 도시의 비용이 최소값이라면 다다음 경로 것까지 충전을 한다.
* 3. 하나의 큐에는 도시 마다 리터 가격을 저장한다
* 4. 다른 큐에는 도시 이동할 때마다 필요한 리터를 저장한다.
* 5. 다음 기름 비용이 더 높다면 현재 기름 비용으로 다음 도시에 드는 비용까지 다 더해준다.
* 6. 다음 기름 비용이 더 낮다면 최소 비용만 더해주고 continue한다.
*
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

       Queue<Long> costs = new LinkedList<>();
       Queue<Long> need = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            need.add(Long.parseLong(st.nextToken()));
        }

        st=new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            long input = Long.parseLong(st.nextToken());
            costs.add(input);
        }

        if(costs.size()==1){
            System.out.println(costs.poll()*need.poll());
            return;
        }

        long result=0;
        long nowCost = costs.poll();
        while(!need.isEmpty()){

            result+=nowCost*need.poll();

            if(nowCost>costs.peek()){
                nowCost=costs.poll();
            }else{
                costs.poll();
            }


        }
       System.out.println(result);
    }

}
