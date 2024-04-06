import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.MIN_VALUE;

public class Main {

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
        int max = MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        List<Integer> keys = new ArrayList<>(hm.keySet());
        Collections.sort(keys);

        int countSameNum=0;

        Collections.sort(keys);
//        for(int i=0;i<keys.size();i++){
//            System.out.print(keys.get(i)+" ");
//        }
//        System.out.println();
        Collections.sort(keys,(v1,v2)->(hm.get(v2).compareTo(hm.get(v1))));

//        for(int i=0;i<keys.size();i++){
//            System.out.print(keys.get(i)+" ");
//        }
//        System.out.println();
        //value값을 기준으로 내림차순 정렬 --> 빈도수가 높은 순으로 정렬
//
//        List<Integer> values = new ArrayList<>(hm.values());
//        Collections.sort(values,Collections.reverseOrder());
//        int temp=values.get(0);
//        for(int i=1;i<values.size();i++){
//                if(values.get(i)==temp)
//                    countSameNum++;
//                else break;
//        }


        if(keys.size()>1 && hm.get(keys.get(0))==hm.get(keys.get(1))){
            return keys.get(1);
        }
        return keys.get(0);
    }
}
