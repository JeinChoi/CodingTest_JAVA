import java.util.*;
class Solution {
    public int solution(int a, int b) {
     List<Integer> divideA = new ArrayList<>();
        List<Integer> divideB = new ArrayList<>();
           int i=2;int num=a;
           while(num>=i){
               if(num%i==0){
                   num/=i;
                   divideA.add(i);
               }
               else i++;
            }
           i=2;num=b;
           while(num>=i){
               if(num%i==0){
                   num/=i;
                   divideB.add(i);
               }
               else i++;
           }
        
          for(int k=0;k<divideA.size();k++){
                   if(divideB.contains(divideA.get(k))){
                       divideB.remove(divideA.get(k));
                   }
           }
          if(divideB.stream().allMatch(n->((n==2)||(n==5))) ||
              divideB.size()==0)
               return 1;
           else return 2;
    }
}