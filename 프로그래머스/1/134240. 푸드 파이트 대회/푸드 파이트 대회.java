import java.util.*;
class Solution {
    public String solution(int[] food) {
      String answer = "";
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                st.push(i);
                answer+=i;
            }
        }
        answer+="0";
        while(!st.isEmpty()){
            answer+=st.pop();
        }
        return answer;
    }
}