import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
      List<Integer> queue = new ArrayList<>();
        int[] answer = new int[score.length];
        for(int i=0;i<score.length;i++){
            if(i<k){
            queue.add(score[i]);    
            }else{
                 if(queue.get(0)<=score[i]){
                queue.remove(0);
                queue.add(score[i]);
            }
            }
            Collections.sort(queue);
            answer[i]=queue.get(0);
        }
        
        return answer;
    }
}