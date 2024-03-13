class Solution {
    public long solution(int k, int d) {
       long count = 0;
        //피타고라스 정리를 활용해서 풀이할 수 있다.
        for(int i=0;i<=d;i+=k){
                count+=(long)Math.sqrt(Math.pow(d,2)-Math.pow(i,2))/k+1;
            //i가 x좌표라 했을 때 for문을 통해 이미 k씩 더해진다.
            //k의 배수인 y 좌표만 구해야 하니까 k로 나눈다. 
            //(x,0)도 구해야 하기 때문에 1을 더해준다.
        }
        
        return count;
    }
}