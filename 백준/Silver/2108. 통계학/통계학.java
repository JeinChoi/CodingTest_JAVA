import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.MIN_VALUE;

public class Main {
/*
* 최반값을 구하는 부분이 어려웠다.
* 
* 36%에서 계속 실패를 했는데 sum의 자료형을 float->double로 바꿨더니 해결이 됐다. 
* 소수점 이하의 정밀도를 갖는 범위가 double이 커서 반올림을 했을 때 정확한 결과가 나온다 그래서 double로 바꿨더니 해결이 된것으로 예상된다.
*
* */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        double sum=0;
        int middle=0;//중앙값
        int range=0;//최대값과 최솟값의 차이

        for(int i=0;i<N;i++){
            int input=Integer.parseInt(br.readLine());
            arr[i]=input;

            sum+=input;//산술평균을 위한 합계 구하기
        }
        Arrays.sort(arr);

        middle=arr[(N-1)/2];
        range=arr[N-1]-arr[0];

        StringBuilder sb = new StringBuilder();

        sb.append(Math.round(sum/N)+"\n");//산술평균
        sb.append(middle+"\n");//중앙값
        sb.append(getBestFrequency(arr)+"\n");//최빈값
        sb.append(range+"\n");//범위

        System.out.println(sb);
    }
    static int getBestFrequency(int[] arr){
        Map<Integer,Integer> hm = new HashMap<>();
       
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        List<Integer> keys = new ArrayList<>(hm.keySet());
        
        Collections.sort(keys);
        Collections.sort(keys,(v1,v2)->(hm.get(v2).compareTo(hm.get(v1))));
        
        if(keys.size()>1 && hm.get(keys.get(0))==hm.get(keys.get(1))){
            return keys.get(1);
        }
        
        return keys.get(0);
    }
}
