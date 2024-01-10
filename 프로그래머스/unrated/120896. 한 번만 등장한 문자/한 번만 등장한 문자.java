import java.util.*;
class Solution {
    public String solution(String s) {
       String[] strArr = s.split("");
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();

       for(String one:strArr){
            if(Arrays.stream(strArr)
                    .filter(o -> Objects.equals(o,one))
                    .count()==1)
                sb.append(one);

       }
        return sb.toString();
    }
}