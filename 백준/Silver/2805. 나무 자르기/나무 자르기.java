import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /**
     * 핵심문장 : 적어도 M미터의 나무를 집에 가져가기 위한 높이
     *
     * 예상 풀이 논리
     * 1. 나무 높이를 오름차순 정렬한다
     * 2. 최소값과 최대값을 기준으로 for문을 돌린다
     * 3. 현재 값으로 배열의 있는 값들을 뺄셈을 할 때 최소 M의 길이를 충족하는 값을 탐색한다
     *
     * 실제 구현
     * 1. 전체 탐색을 했더니 시간 초과가 나서 이분 탐색을 방법을 바꿨다
     * 2. 2%에서 계속 실패로 뜨는 중이라 못풀었습니다
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N= Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());//최소 입력값 이상의 나무를 베야한다.

        String[] arr = br.readLine().split(" ");
        long[] intArr = new long[N];

        for(int i=0;i<N;i++){
            intArr[i]=Long.parseLong(arr[i]);
        }

        Arrays.sort(intArr);//오름차순 정렬

        long start=0L;
        long end=intArr[intArr.length-1];

        while(start<=end){
            long mid= (start+end)/2L;
            long sum=cal(mid,intArr);

            if(sum>=M){//자른 나무의 총길이가 기준보다 크다면 더 자르기 위해 +를 한다
                start=mid+1;
            }
            else{//sum<M 일 경우. 기준보다 작다면 -를 한다.
                end=mid-1;
            }
        }
        System.out.println(end);

    }
    static long cal(long mid,long[] intArr){
        long sum=0;
        for (long height : intArr) {
            if (height - mid > 0) {
                sum += (height - mid);
            }
        }
        return sum;
    }
}
