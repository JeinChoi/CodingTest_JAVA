import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
    String[] answer = new String[strings.length];
        Map<Character,List<String>> hm = new HashMap<>();
        for(int i=0;i<strings.length;i++){

            if(hm.get(strings[i].charAt(n))!=null){
                List<String> temp = hm.get(strings[i].charAt(n));
                temp.add(strings[i]);
                Collections.sort(temp);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strings[i]);
                hm.put(strings[i].charAt(n),list);
            }

        }
        Object[] keyArr = hm.keySet().toArray();
         Arrays.sort(keyArr);
        int k=0;
        for(int i=0;i<keyArr.length;i++){
            for(int j=0;j<hm.get(keyArr[i]).size();j++){
                answer[k]=hm.get(keyArr[i]).get(j);
                k++;
            }
        }
        return answer;
    }
}