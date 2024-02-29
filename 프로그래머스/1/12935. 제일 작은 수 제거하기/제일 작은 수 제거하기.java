import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
         int max = 99999;
        List<Integer> array = new ArrayList<>();
        for(int one : arr){
            if(one<max)
                max=one;
        }
        for(int one: arr){
            if(one!=max)
                array.add(one);
            else continue;
        }
        return arr.length==1?
                new int[]{-1}:array.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
    }
}