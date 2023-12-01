class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
         int[] answer = new int[2];
           int mul=1;int resultNum=0;
           if(denom1!=denom2){
            int lcm=denom1*denom2/getGCD(denom1,denom2);
               numer1*=lcm/denom1;
               numer2*=lcm/denom2;
               resultNum=numer1+numer2;
               mul=lcm;
           }else{
               resultNum=numer1+numer2;
               mul=denom1;
           }
           answer[0]=resultNum;
           answer[1]=mul;

           int gcd=getGCD(answer[0],answer[1]);
           if(resultNum%gcd==0){
               answer[0]/=gcd;
               answer[1]/=gcd;
           }
           return answer;
       }
        static int getGCD(int num1,int num2){
            if(num1%num2==0){
                return num2;
            }
            return getGCD(num2,num1%num2);
        }
}