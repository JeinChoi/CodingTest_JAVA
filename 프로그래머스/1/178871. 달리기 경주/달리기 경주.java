import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
      String[] answer = new String[players.length];
        Map<Integer,String> map = new TreeMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        
        for(int i=0;i< players.length;i++){
            map.put(i+1,players[i]);
            map2.put(players[i],i+1); 
        }
        
        for(int i=0;i<callings.length;i++){
            String call = callings[i];//따라 잡은 선수
            int idx = map2.get(call);//현재 위치
            
            String curPlayer = map.get(idx-1);//뒤처진 선수
            
            map2.put(call,idx-1);
            map2.put(curPlayer,idx);

            map.put(idx-1,call);
            map.put(idx,curPlayer);
        }
        
        int idx=0;
        for(int key:map.keySet())
            answer[idx++]=map.get(key);
        return answer;
    }
}