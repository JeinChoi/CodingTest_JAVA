import java.util.*;
class Solution {
    public int solution(int[][] board) {
       int many = 0;

           ArrayList<Integer[]> list = new ArrayList<>();
           for(int i=0;i<board.length;i++){
               for(int j=0;j<board.length;j++){
                   if(board[i][j]==1){
                       list.add(new Integer[]{i,j});
                       list.add(new Integer[]{i,j+1});
                       list.add(new Integer[]{i,j-1});
                       list.add(new Integer[]{i+1,j});
                       list.add(new Integer[]{i-1,j});
                       list.add(new Integer[]{i-1,j-1});
                       list.add(new Integer[]{i-1,j+1});
                       list.add(new Integer[]{i+1,j-1});
                       list.add(new Integer[]{i+1,j+1});
                   }
               }
           }
      for(int i=0;i<list.size();i++){
          int x=list.get(i)[0];
          int y=list.get(i)[1];
          if(x>=0&&x<board.length&&y>=0&&y<board.length)
            board[x][y]=1;
      }
      for(int i=0;i<board.length;i++){
          for(int j=0;j<board.length;j++){
             if(board[i][j]==1) many++;
          }
      }
           return (board.length*board.length-many);
    }
}