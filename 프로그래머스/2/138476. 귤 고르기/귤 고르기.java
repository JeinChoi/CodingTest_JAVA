import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
       HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<tangerine.length;i++){
            hm.put(tangerine[i],hm.getOrDefault(tangerine[i],0)+1);
        }
        List<Integer> keys = new ArrayList<>(hm.keySet());
        Collections.sort(keys, (v2, v1) -> (hm.get(v1).compareTo(hm.get(v2))));
        int total=0;
        int i=0;
        for(i=0;i<keys.size();i++){
            if(total>=k) break;
            total+=hm.get(keys.get(i));

        }
        return i;

    }
}