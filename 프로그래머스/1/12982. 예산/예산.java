import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
         Arrays.sort(d);
        int i=0;int total=0;
        for(i=0;i<d.length;i++){
            total+=d[i];
            if(total==budget)
                return i+1;
            if(total>budget)
                return i;
        }
        return i;
    }
}