import java.util.*;
class Solution {
    public int[] solution(String my_string) {
      List<Integer> ansArr = new ArrayList<>();
        char temp;
        for(int i=0;i<my_string.length();i++){
            temp=my_string.charAt(i);
            if(temp>47&&temp<58)
                ansArr.add(Integer.parseInt(String.valueOf(temp)));
        }
        int[] answer = ansArr.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}