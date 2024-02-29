class Solution {
    public String solution(String phone_number) {
        String sh = "*";
        int len = phone_number.length();
        String answer = sh.repeat(len-4)+
                phone_number.substring(len-4,len);
        return answer;
    }
}