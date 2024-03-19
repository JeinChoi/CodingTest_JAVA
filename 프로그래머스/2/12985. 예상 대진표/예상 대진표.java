class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        if(a%2!=0) a+=1;
        if(b%2!=0) b+=1;
        boolean bigger= a > b;
        while(true){ 
            if(a%2!=0) a+=1;
            if(b%2!=0) b+=1;
           if(bigger){
               if(a==b+1) break;
           }else if(b==a+1) break;
         if(a==b) break;
            answer++;a/=2;b/=2;
        }
        return answer;
    }
}