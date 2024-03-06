class Solution {
    public int solution(int a, int b, int n) {
          int answer = 0;
        int spare=0;
        int num=n;
        while(true){
            if(num<=a-1)
                break;
            answer+=num/a*b;
            spare=num%a;
            num=num/a*b+spare;
       }
        return answer;
    }
}