import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string) {
        String[] strArr=my_string.toLowerCase().split("");
        Arrays.sort(strArr);
        return Arrays.stream(strArr).collect(Collectors.joining());
    }
}