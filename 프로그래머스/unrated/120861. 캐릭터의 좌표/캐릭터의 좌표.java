class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xMin=-board[0]/2;
        int xMax=board[0]/2;
        int yMin=-board[1]/2;
        int yMax=board[1]/2;
        for(int i=0;i<keyinput.length;i++){
            switch(keyinput[i]){
                case "left":
                    answer[0]-=1;
                    break;
                case "right":
                    answer[0]+=1;
                    break;
                case "up":
                    answer[1]+=1;
                    break;
                case "down":
                    answer[1]-=1;
                    break;
            
            }
            
              if(answer[0]>xMax)
            answer[0]=xMax;
        if(answer[0]<xMin)
            answer[0]=xMin;
        if(answer[1]>yMax)
            answer[1]=yMax;
        if(answer[1]<yMin)
            answer[1]=yMin;
    
        }
        
        
      
        return answer;
    }
}