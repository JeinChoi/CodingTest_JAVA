import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
         List<Integer> array = new ArrayList<>();
       for(int one :arr){
            if(one%divisor==0){
                array.add(one);
            }
        }
        Collections.sort(array);
        return array.size()!=0?array.stream()
                .mapToInt(Integer::intValue)
                .toArray() : new int[]{-1};
    }
}