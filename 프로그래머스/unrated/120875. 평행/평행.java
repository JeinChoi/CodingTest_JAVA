class Solution {
    public int solution(int[][] dots) {
      int answer = 0;
           for(int i =0; i<dots.length;i++) {
               
               float temp =slope(dots[i],dots[(i+1)%4]);
               float temp2 =slope(dots[(i+2)%4],dots[(i+3)%4]);

               if(temp==temp2) {
                   answer = 1;
               }
               
           }
           return answer;
       }
    public static float slope(int[]a1,int[]a2) {
        float bot,top;

        bot= a1[0]-a2[0];
        top= a1[1]-a2[1];

        return top/bot;
    }

}