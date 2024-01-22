class Solution {
    public int solution(int n) {
        int answer=1; int sum=n;
        while(true){
            sum/=answer;
            if(sum<=0)
                break;
            answer++;
        }
        return --answer;
    }
}