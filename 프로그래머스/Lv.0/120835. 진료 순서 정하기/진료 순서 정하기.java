import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
       int[] answer = new int[emergency.length];
        Integer[] arr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,Collections.reverseOrder());
        int k=0;
        for(int i=0;i<emergency.length;i++){
            for(int j=0;j<arr.length;j++){
                if(emergency[i]==arr[j])
                    answer[k]=j+1;
            }
            k++;
        }
        return answer;
    }
}