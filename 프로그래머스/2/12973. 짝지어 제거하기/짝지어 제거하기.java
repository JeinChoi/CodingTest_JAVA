import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<String> st =new Stack<>();
        st.push(s.charAt(0)+"");
      for(int i=1;i<s.length();i++){
          if(st.isEmpty()) {
              st.push(s.charAt(i)+"");
              continue;
          }
          
          if(st.peek().equals(s.charAt(i)+"")){
              st.pop();
          } 
          else st.push(s.charAt(i)+"");
          
      }
      return st.isEmpty()? 1:0;
    }
}