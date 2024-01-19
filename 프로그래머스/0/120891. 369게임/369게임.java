class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] arr = (order+"").split("");
        for(String one : arr){
            if(Integer.parseInt(one)%3==0&&!one.equals("0"))
                answer++;
        }
        return answer;
    }
}