class Solution {
    public int[] solution(int n, int m) {
      int[] answer = new int[2];
        int maxShare=1;
        for(int i=1;i<=(Math.min(n, m)); i++){
            if(n%i==0&&m%i==0){
                maxShare=i;
                answer[1]=n/i*m/i*maxShare;
            }
        }
        answer[0]=maxShare;
        return answer;
    }
}