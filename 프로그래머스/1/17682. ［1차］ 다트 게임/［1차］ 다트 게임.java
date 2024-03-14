class Solution {
    public int solution(String dartResult) {
         int answer = 0;
         for(int i=1;i<dartResult.length();i++){
             switch(dartResult.charAt(i)){
                 case 'S':
                     answer+=dartResult.charAt(i-1)-'0';
                     break;
                 case 'D':
                     answer+=(int)Math.pow(dartResult.charAt(i-1)-'0',2);
                      break;
                 case 'T':
                     answer+=(int)Math.pow(dartResult.charAt(i-1)-'0',3);
                     break;
                 case '*':
                     answer*=2;
                     break;
             }

         }
         return answer;
    }
}