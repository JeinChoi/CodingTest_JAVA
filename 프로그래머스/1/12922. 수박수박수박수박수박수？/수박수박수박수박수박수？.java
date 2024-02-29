class Solution {
    public String solution(int n) {
        String[] word ={"수","박"};
        String answer = "";
        for(int i=0;i<n;i++){
            answer+=word[i%2];
        }
        return answer;
    }
}