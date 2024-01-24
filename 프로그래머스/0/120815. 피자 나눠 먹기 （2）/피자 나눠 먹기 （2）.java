class Solution {
    public int solution(int n) {
        int answer = 6;
        while(true){
            if(answer%n==0)
                break;
            answer+=6;
                
        }
    
        return answer/6;
    }
}