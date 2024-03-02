class Solution {
    public int solution(int left, int right) {
        int answer = 0; int nums=0;
        for(int i=left;i<=right;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    nums++;
            }
            if(nums%2==0)
                answer+=i;
            else answer-=i;
            nums=0;
        }
        return answer;
    }
}