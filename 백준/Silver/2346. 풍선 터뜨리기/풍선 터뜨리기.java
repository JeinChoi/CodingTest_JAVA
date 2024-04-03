import java.util.*;
import java.io.*;

public class Main{
public static class Balloon{
    int place;
    int move;
    public Balloon(int place,int move){
        this.place=place;
        this.move=move;
    }
}
    public static void main(String[] args) throws IOException{
        /*
        * 1. 덱을 생성해서 입력받는다
        * 2. 첫째 인덱스를 저장한다.
        * 3. peekFirst를 통해 첫째값을 알아낸다.
        * 4. 삭제 한 뒤 그 뒤에 값들을 또 삭제하면서 offerLast()한다
        * 5. 반복한다.
        * */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        Deque<Balloon> dq = new ArrayDeque<>();
        for(int i=1;i<=N;i++){
            Balloon balloon = new Balloon(i,sc.nextInt());
            dq.offerLast(balloon);
        }

        int standard=0;
        while(!dq.isEmpty()){
            sb.append(dq.peekFirst().place+" ");
            standard=dq.pollFirst().move;
            if(dq.isEmpty()) break;

                if(standard>0){
                    for(int i=0;i<Math.abs(standard)-1;i++) {
                        dq.offerLast(dq.pollFirst());
                    }

                }
                else {
                    for(int i=0;i<Math.abs(standard);i++) {
                        dq.addFirst(dq.pollLast());
                    }
                }

        }
        System.out.println(sb);
}

}