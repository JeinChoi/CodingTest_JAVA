class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length()%n!=0?(my_str.length()/n+1):(my_str.length()/n);
        String[] answer = new String[len];
        int j=0;
        for(int i=1;i<len;i++){
            answer[j]=my_str.substring(0,n);
            my_str=my_str.substring(n);
            j++;
        }
        answer[j]=my_str;
        return answer;
    }
}