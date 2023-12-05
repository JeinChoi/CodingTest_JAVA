class Solution {
    public int solution(int[] common) {
        int answer=0;
        int flag=0;
        int distance=0;
            if(common[1]-common[0]==common[2]-common[1])
                flag=1;
            else
                flag=0;
            if(flag==1){
                distance=common[1]-common[0];
                answer=common[0]+(common.length)*distance;
            }
            else{
                distance=common[1]/common[0];
                answer=common[0]*((int)Math.pow(distance,common.length-1+1));
            }
        return answer;
    }
}