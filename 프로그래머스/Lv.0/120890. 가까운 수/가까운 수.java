import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 999;

        Integer[] distance=Arrays.stream(array).boxed().toArray(Integer[]::new);
        distance=Arrays.stream(distance).map(c->Math.abs(c-n)).toArray(Integer[]::new);//각 배열값의 n과의 차이 구해서 distance에 저장하기
       
        int min = Arrays.stream(distance).min(Integer::compare).get();//distance 배열값중 최소값 구하기
        
        List<Integer> place = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(distance[i]==min)
                place.add(i);
        }//같은 최소값 개수와 배열값 위치 구하기

        int num;
        for(int i=0;i<place.size();i++){
            num=array[place.get(i)];
            if(num<=answer){
                answer=num;
            }
        }
        return answer;

    }
}