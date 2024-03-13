import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
       int[] answer = new int[N];int howMany=0;int people=stages.length;
        Map<Integer,Double> fails = new HashMap<>();
        for(int i=1;i<=N;i++){
            for(int j=0;j<stages.length;j++){
                if(stages[j]==i)
                    howMany++;
            }
            fails.put(i,howMany==0?0.0:(double) howMany /people);
            people-=howMany;
            howMany=0;
        }
        List<Integer> keySet = new ArrayList<Integer>(fails.keySet());

        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return fails.get(o2).compareTo(fails.get(o1));
            }
        });

        for(int i=0;i<answer.length;i++){
            answer[i]=keySet.get(i);
        }
        return answer;
    }
}