class Solution {
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited= new boolean[computers.length];
        
        
        
        for(int i=0;i<computers.length;i++){
            if(visited[i]==false){
                answer++;
                dfs(i,visited,computers);
        }
        }
        return answer;
    }
        
     public void dfs(int node,boolean[] visited,int[][] computers){
        
        visited[node]=true;
        
        for(int i=0;i<visited.length;i++){
            if(visited[i] == false && computers[node][i] == 1){
                dfs(i, visited, computers);
            }//아직 방문 안했고 연결되어 있다면 
//만약에 네트워크가 연결되어 있으면 visited만 true로 표시하고 이어짐이 끝날때까지 방문 표시만 한다. 
            //그리고 만약에 이어짐이 끝나면 메인함수로 돌아가서 
            //그다음 노드가 방문을 안했다면 탐색을 다시 시작한다.
                
            }
        }
}