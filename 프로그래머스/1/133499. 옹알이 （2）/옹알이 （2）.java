class Solution {
    public int solution(String[] babbling) {
         int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        String[] repeatStr = {"ayaaya", "yeye", "woowoo", "mama"};
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<str.length; j++){
                babbling[i] = babbling[i].replaceAll(repeatStr[j], "1").replaceAll(str[j], " ");
             }//연속직인 babbling이 있다면 1로 대체하고, 해당하는 babbling 있다면 하나의 빈칸으로 대체한다.
            //만약 trim함수를 썼을 때 1이 한개이상 있다면 답이 아님.
            if(babbling[i].trim().length() == 0){
                answer++;
            }

         }
        return answer;
    }
}