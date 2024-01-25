class Solution {
    public String solution(int age) {
        StringBuffer answer = new StringBuffer();
        int length = (age+"").length();
        for(int i=0;i<length;i++){
            int temp = age%10;age/=10;
            answer.append(Character.toString((char)(temp+97)));
        }
        return answer.reverse().toString();
    }
}