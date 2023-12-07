import java.util.*;
class Solution {
    public int solution(int[] array) {
             int answer = -9999;
        int howMany=-9999;
        Set<Integer> set = new HashSet<>();
           for(int i=0;i<array.length;i++){
               set.add(array[i]);
           }

           int[][] count = new int[set.size()][2];
         Iterator<Integer> iterSet=set.iterator();
         int k=0;
         while(iterSet.hasNext()){
             count[k][0]=iterSet.next();
              k++;
         }

           for(int i=0;i<array.length;i++){
               for(int j=0;j<count.length;j++){
                   if(array[i]==count[j][0]){
                       count[j][1]++;
                   }
               }
           }

           for(int i=0;i<count.length;i++){
               if(count[i][1]>howMany){
                   howMany=count[i][1];
                   answer=count[i][0];
               }
           }
           int repeat=0;
           for(int i=0;i<count.length;i++){
               if(count[i][1]==howMany) repeat++;
               if(repeat>1) answer=-1;
           }

           return answer;


        
    }
}