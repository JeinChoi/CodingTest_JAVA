import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
/*
* 1. 모든 탐색 문제 같다.
* 2. 큐에 상어가 위치한 좌표를 추가한다
* 3. 상어가 위치한 좌표들 기준으로 8방향을 탐색하여 해당 좌표를 큐에 또 추가한다 - depth=1
* 4. 큐에 있는 좌표를 꺼내면서 8방향을 또 탐색한다. 아직 0인 좌표가 있다면 큐에 추가한다. -depth=2
* 5. 3,4 반복. 모든 배열에 0이 없을때 탐색이 끝난다.
*
* */
    static class Coordinate{
        int x;
        int y;
        public Coordinate(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
        public static void main(String[] args) throws IOException {
            var br = new BufferedReader(new InputStreamReader(System.in));
            var tokenizer = new StringTokenizer(br.readLine());

            int row = Integer.parseInt(tokenizer.nextToken());
            int column = Integer.parseInt(tokenizer.nextToken());
            int[][] arr = new int[row][column];
            int[][] direction = {{1,0},{-1,0},{0,-1},{0,1},{1,1},{-1,1},{-1,-1},{1,-1}};
            Queue<Coordinate> q = new LinkedList<>();

            for (int i = 0; i < row; i++) {
                 tokenizer = new StringTokenizer(br.readLine());
                int j=0;
                while(tokenizer.hasMoreTokens()){
                    int element=Integer.parseInt(tokenizer.nextToken());
                    if(element==1) {
                        q.add(new Coordinate(i,j));
                        arr[i][j]=-1;
                    }
                    j++;
                }
            }
            int depth=0;
            while (!q.isEmpty()) {
                depth++;
                int size=q.size();

                for(int i=0;i<size;i++) {
                    Coordinate now =q.poll();
                    for (int j = 0; j < 8; j++) {
                        int nx = now.x + direction[j][0];
                        int ny = now.y + direction[j][1];
                        if ((nx >= 0 && nx < row) &&
                                (ny >= 0 && ny < column) &&
                                arr[nx][ny] == 0) {
                            arr[nx][ny] = depth;
                            q.add(new Coordinate(nx,ny));
                        }
                    }
                }
               // System.out.println("?????");

            }
            System.out.println(depth-1);
        }
}