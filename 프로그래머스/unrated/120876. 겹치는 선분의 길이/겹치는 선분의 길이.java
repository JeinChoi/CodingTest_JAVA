class Solution {
    public int solution(int[][] lines) {
            int answer = 0;
           int start=9999;
           int end=-9999;

           int distanceStart =-9999;
           int distanceEnd=9999;//세개의 선분 범위가 겹치는지 알아보기 위한 설정
           int[][] distance= new int[3][2];
           //첫번째 두번째
           distance[0][0] = lines[0][0]>lines[1][0]?lines[0][0]:lines[1][0];
           distance[0][1] = lines[0][1]<lines[1][1]?lines[0][1]:lines[1][1];
//비교 했을 때 0번째 값이 더 크면 안됨
           //첫번째 세번째 비교
           distance[1][0] = lines[0][0]>lines[2][0]?lines[0][0]:lines[2][0];
           distance[1][1] = lines[0][1]<lines[2][1]?lines[0][1]:lines[2][1];

           //두번째 세번째 비교
           distance[2][0] = lines[1][0]>lines[2][0]?lines[1][0]:lines[2][0];
           distance[2][1] = lines[1][1]<lines[2][1]?lines[1][1]:lines[2][1];
            for(int i=0;i<distance.length;i++){
                if(distance[i][0]> distance[i][1]){
                    distance[i][0]=-9999;
                    distance[i][1]=9999;
                }//시작 좌표가 끝 좌표보다 크면 안됨.
                if(distance[i][0]>distanceStart){
                    distanceStart=distance[i][0];
                }//가장 큰 시작 좌표를 구함
                if(distance[i][1]<distanceEnd){
                    distanceEnd=distance[i][1];
                }//가장 작은 끝 좌표를 구함
            }
if(distanceEnd>distanceStart){//최대로 큰 끝좌표가 시작 좌표보다 크다는 건 겹친다는 뜻  
           for(int i=0;i<distance.length;i++){
               if(distance[i][0]==-9999){
                   continue;
               }
                   if(distance[i][0]<=start){
                       start=distance[i][0];
                   }
                   if(distance[i][1]>=end){
                       end=distance[i][1];
                   }
           }
           answer=end-start;
}else{//최대의 끝 좌표가 최소의 시작 좌표보다 작다는건 안겹친다는 뜻 
    for(int i=0;i<distance.length;i++){
        if(distance[i][0]==-9999){
            continue;
        }
     answer+=distance[i][1]-distance[i][0];
    }
}
            return answer;
    }
}