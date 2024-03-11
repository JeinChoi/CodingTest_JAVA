import java.util.*;
class Solution {
      static public int solution(int n, int k) {
        int answer = 0;
        String change =Integer.toString(n,k);
        StringTokenizer tokens = new StringTokenizer(change,"0");
        while(tokens.hasMoreElements()){
            if(prime(tokens.nextToken()))
                answer++;
        }
        return answer;
    }
    static public boolean prime(String str){
        int num = Integer.parseInt(str);
        int i=0;
        for(i=2;i<=Math.sqrt(num);i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return num != 1;
    }
}