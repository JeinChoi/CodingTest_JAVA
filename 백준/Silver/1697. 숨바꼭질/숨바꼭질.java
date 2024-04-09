import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int count=1; //초수를 세기 위한 변수다. visited 배열이 int형이기 때문에 0이 아닌 1로 초기화
    static int[] visited = new int[100001];//방문했을 당시에 초수를 기록
    static int younger;//동생의 위치를 담기 위한 변수
    static Queue<Integer> queue=new LinkedList<>();
    //먼저 방문한 위치를 꺼내야하기 때문에 큐를 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int subin=Integer.parseInt(st.nextToken());//수빈의 위치를 입력
        younger=Integer.parseInt(st.nextToken());//동생의 위치를 입력

        if(subin==younger) {//처음부터 같은 위치라면 0을 출력
            System.out.println(0);
            return;
        }
        bfs(subin);
    }

    private static void bfs(int place) {
        int size;
        visited[place]=count;//시작 위치를 방문했으니 count변수로 저장
        queue.add(place);//현재 위치를 큐에 추가

        while(true){
            size=queue.size();
            count++;
            for(int i=0;i<size;i++){
                int now = queue.poll();//현재 위치를 저장
               // System.out.println("첫번째 now 와 count "+now+" "+count);
                
                if(now+1==younger || now-1==younger || now*2==younger){
                    visited[younger]=count;
                    System.out.println(count-1);
                    return;
                }
                if(now+1<=100000 && visited[now+1]==0){
                    visited[now+1]=count;
                    queue.add(now+1);
                }
                if(now-1>=0 && visited[now-1]==0){
                    visited[now-1]=count;
                    queue.add(now-1);
                }
                if(now*2<=100000 && visited[now*2]==0){
                    visited[now*2]=count;
                    queue.add(now*2);
                }
            }

        }
    }
}