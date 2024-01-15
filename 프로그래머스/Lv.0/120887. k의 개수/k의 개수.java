class Solution {
    public int solution(int i, int j, int k) {
   int answer = 0;
        for(int l=i;l<=j;l++){
            String temp = l+"";
            for(int m=0;m<temp.length();m++){
                if((temp.charAt(m)+"").equals(k+""))
                    answer++;
            }
        }
        return answer;
    }
}