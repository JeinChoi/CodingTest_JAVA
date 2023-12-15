class Solution {
    public int solution(int chicken) {
        int answer = 0; int spare=0;
        while(chicken>=1){
            answer+=chicken/10;
            spare+=chicken%10;
            chicken/=10;
        }
        answer+=spare/10;
        int spare2=spare/10+spare%10;
        answer+=spare2/10;
        return answer;
    }
}