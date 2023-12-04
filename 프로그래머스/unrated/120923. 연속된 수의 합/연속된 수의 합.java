import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
         int[] answer = new int[num];
        int n=0;int mid=total/num;
        n=mid;
        int i=0;
        for(i=0;i<(num%2==0?(num/2-1):(num/2));i++){
            answer[i]=--n;
        }
        n=mid;
        for(i=(num%2==0?(num/2-1):(num/2));i<(num-1);i++){
            answer[i]=++n;
        }answer[i]=mid;
        Arrays.sort(answer);
        return answer;
    }
}