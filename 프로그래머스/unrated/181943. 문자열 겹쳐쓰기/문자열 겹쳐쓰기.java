
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String temp = my_string.substring(0,s)+overwrite_string;
        String temp2 = my_string.substring(s+overwrite_string.length());
        String answer = temp+temp2;
        return answer;
    }
}