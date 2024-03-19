class Solution {
    public int solution(int n) {
        int answer=0;
     for(int i=1;i<=n;i++){
         int inum=i;
         int result=0;
         while(true){
             result+=inum;
             if(result==n){
                 answer++;
                 break;
             } else if(result>n)
                 break;
             inum++;
         }
     }
        return answer;
    }
}