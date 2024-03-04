import java.util.*;
class Solution {
    public int solution(int n) {
       int answer = 0;
        Stack<Integer> st = new Stack<>();
         while(n>0){
            st.push(n%3);
            n/=3;
        }
        int i=0;
        while(!st.isEmpty()){
            answer+= (int) (Math.pow(3,i)*st.pop());
            i++;
        }
        return answer;
    }
}