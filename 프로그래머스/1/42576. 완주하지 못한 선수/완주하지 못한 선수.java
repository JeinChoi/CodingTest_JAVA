import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
   String answer="";
        HashMap<String,Integer> participantHashMap = new HashMap<>();
        HashMap<String,Integer> completionHashMap = new HashMap<>();
        for(String one : participant)
            participantHashMap.put(one,participantHashMap.getOrDefault(one,0)+1);
        for(String one : completion)
            completionHashMap.put(one,completionHashMap.getOrDefault(one,0)+1);

        for(String one : participant)
            if(!participantHashMap.get(one).equals(completionHashMap.get(one)))
                answer=one;

        return answer;
   }
}