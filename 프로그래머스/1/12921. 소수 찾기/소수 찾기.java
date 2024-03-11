class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2;i<=n;i++){
           if(prime(i)==1)
                answer++;
        }
        return answer;
    }
    
    static public int prime(int num){
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0)
                return 0;
        }
        return 1;
    }
}