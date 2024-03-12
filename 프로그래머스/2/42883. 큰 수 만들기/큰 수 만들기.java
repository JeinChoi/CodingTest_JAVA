import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String number, int k) {
      Stack<Character> stack = new Stack<>();

        for(int i=0;i<number.length();i++){
            char o = number.charAt(i);
            while(!stack.isEmpty()&&stack.peek()<o&&k>0){
                System.out.println(stack.peek());
                stack.pop();
                k--;
            }//스택에 있는 값이 꺼낸 값보다 작다면 pop 하기. k개를 제거해야 하니까 k가 0보다 커야 pop이 가능.
            stack.add(o);
        }
        while(k-- >0) stack.pop(); //제거할 개수가 남아있는 경우 while 문으로 pop

        return stack.stream().map(Object::toString).collect(Collectors.joining());
    }
}