class Solution {
    public int solution(int[][] dots) {
        int width,height;
        int max=-9999,min=9999;
        for(int i=0;i<dots.length;i++){
            if(dots[i][0]>max)
                max=dots[i][0];
            if(dots[i][0]<min)
                min=dots[i][0];
        }
        width=max-min;
        max=-9999;min=9999;
         for(int i=0;i<dots.length;i++){
            if(dots[i][1]>max)
                max=dots[i][1];
            if(dots[i][1]<min)
                min=dots[i][1];
        }
        height=max-min;
        int answer=width*height;
       
        return answer;
    }
}