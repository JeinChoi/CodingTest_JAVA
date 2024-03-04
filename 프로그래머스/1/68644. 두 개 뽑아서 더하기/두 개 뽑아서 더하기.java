import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
         int[] answer = {};
         Set<Integer> se = new HashSet<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(i==j)
                    continue;
                se.add(numbers[i]+numbers[j]);
            }
        }
        answer=se.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}