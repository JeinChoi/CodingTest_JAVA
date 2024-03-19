class Solution {
    public int solution(int n) {
            int[] cal = new int[3];
        cal[0]=0;cal[1]=1;cal[2]=1;
        for(int i=3;i<=n;i++){
            switch(i%3){
                case 0:
                    cal[0]=(cal[1]+cal[2])%1234567;
                    break;
                case 1:
                    cal[1]=(cal[0]+cal[2])%1234567;
                    break;
                case 2:
                    cal[2]=(cal[0]+cal[1])%1234567;
                    break;
            }
        }
        return cal[n%3]%1234567;
    }
}