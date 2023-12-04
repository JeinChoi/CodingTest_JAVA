import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int n=0;
        while(true){
            n++;
            if(n*(n+1)/2>=total)
                break;
        }
        for(int i=0;i<num;i++){
            answer[i]=n--;
        }
        Arrays.sort(answer);
        return answer;
    }
}