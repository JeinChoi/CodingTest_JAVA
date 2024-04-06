import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
/**
 *세심하게 접근해야한다고 생각해서 이분탐색을 시도했다.
 *
 *
 */
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long wholeGameCount = Integer.parseInt(st.nextToken());
        long winGameCount=Integer.parseInt(st.nextToken());

        int presentWinPercent= (int)((winGameCount*100)/wholeGameCount);

        if(presentWinPercent>=99) {
            System.out.println(-1);
            return;
        }

        int start=0;
        int end=1000000000;
        int percent=0;
        int result=0;//추가해야할 게임 횟수

        while(start<=end){

            int mid=(start+end)/2;
            percent=(int)(((winGameCount+mid)*100)/(wholeGameCount+mid));

            if(presentWinPercent>=percent){
                start=mid+1;
                result=mid+1;//현재 승률보다 작으면 start를 증가한다. start값에 있는 숫자가 범위 안에서 최소값이 될거니까 추가해야할 게임횟수를 구한다
            }
            else{//현재 승률보다 크면 end를 감소한다.
                end=mid-1;
            }
        }

        System.out.println(result);


    }


}
