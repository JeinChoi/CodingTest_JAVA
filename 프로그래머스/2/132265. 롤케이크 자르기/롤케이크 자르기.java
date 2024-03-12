import java.util.*;
class Solution {
    public int solution(int[] topping) {
      int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> brother = new HashMap<>();

        for (int j : topping) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (int j : topping) {
            if (map.get(j)-1==0)
                map.remove(j);
            else map.put(j,map.get(j)-1);

            brother.put(j, brother.getOrDefault(j, 0) + 1);
            if (map.size() == brother.size()) {
                answer++;
            }
        }

        return answer;
    }
}