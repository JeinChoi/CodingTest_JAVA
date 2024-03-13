class Solution {
    public long solution(int k, int d) {
       long answer = 0;
         for(int x =0;x<=d;x+=k){
             for(int y=0;y<=d;y+=k){
                 if(Math.sqrt((long)Math.pow((x),2)+(long)Math.pow((y),2))<=d){
                     answer++;
                 }else break;
             }
         }
         return answer;
    }
}