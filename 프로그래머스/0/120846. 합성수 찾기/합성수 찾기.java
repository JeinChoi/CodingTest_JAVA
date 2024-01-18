class Solution {
    public int solution(int n) {
       int answer = 0;int j;
    for(int i=1;i<=n;i++){
        j=2;
        while(j<i){
            if(i%j==0) {
                answer++;break;
            }
            j++;
        }
    }
    return answer;
 }
}