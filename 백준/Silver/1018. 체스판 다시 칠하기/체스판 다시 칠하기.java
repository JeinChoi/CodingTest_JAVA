import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.Stream;

import static java.lang.Integer.MAX_VALUE;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] arr = br.readLine().split(" ");
       int N=Integer.parseInt(arr[0]);
       int M=Integer.parseInt(arr[1]);

       String[] chessArr = new String[N];
       for(int i=0;i<N;i++){
           chessArr[i]=br.readLine();
       }


       int min=MAX_VALUE;
       for(int i=0;i<=N-8;i++){
           for(int j=0;j<=M-8;j++){
               int result=countBlock(i,j,chessArr);
               if(result<min){
                   min=result;
               }
           }
       }
        System.out.println(min);
    }
    public static int countBlock(int startRow, int startCol, String[] chessArr){
        String[] board= {"WBWBWBWB","BWBWBWBW"};
        int count=0;
        for(int i=0;i<8;i++){
            int row=startRow+i;
            for(int j=0;j<8;j++){
                int col=startCol+j;
                if(chessArr[row].charAt(col)!=board[row%2].charAt(j))
                    count++;
            }
        }
        return Math.min(count,64-count);
    }
}