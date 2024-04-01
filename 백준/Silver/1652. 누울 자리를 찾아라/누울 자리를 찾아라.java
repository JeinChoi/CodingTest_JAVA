
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(br.readLine());
     String[][] arr = new String[n][n];
     
     for(int i=0;i<n;i++){
         arr[i]=br.readLine().split("");
     }
     
    System.out.println(getWidth(n, arr)+" "+getHeight(n, arr));

    }

    private static int getHeight(int n, String[][] arr) {
        int height=0;
        int county=0;
        for(int j = 0; j< n; j++){
            county=0;
            for(int i = 0; i< n; i++){
                if(arr[i][j].equals("X")){
                  if(county>=2) height++;
                  county=0;
                }else county++;
            } if(county>=2) height++;
        }
        return height;
    }

    private static int getWidth(int n, String[][] arr) {
        int width=0;
        int countw=0;
        for(int i = 0; i< n; i++){
            countw=0;
            for(int j = 0; j< n; j++){
                if(arr[i][j].equals("X")){
                    if(countw>=2) width++;
                    countw=0;
                }else countw++;
    
            }  if(countw>=2) width++;
        }
        return width;
    }


}