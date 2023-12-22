class Solution {
    public int solution(int[] sides) {
       int answer = 0;
        int min = Math.max(sides[0],sides[1])-Math.min(sides[0],sides[1]);
        int max = sides[0]+sides[1];
        for (int i=min+1;i<max;i++){
            answer++;
        }
        return answer;
    }
}