import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
   Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(st.peek()==arr[i])
                continue;
            st.push(arr[i]);
        }
        int[] answer = new int[st.size()];
        int index=st.size()-1;
        while (!st.isEmpty()) {
            answer[index--] = st.pop();
        }
        return answer;
    }
}