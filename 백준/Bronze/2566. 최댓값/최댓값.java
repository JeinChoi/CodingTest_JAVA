
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int max=0;int maxPositionX=0; int maxPositionY=0;
     
     for(int i=0;i<9;i++){
         int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
         for(int j=0;j<9;j++){
             if((nums[j])>max){
                 max=nums[j];
                 maxPositionX=i;
                 maxPositionY=j;
             }
         }
     }
        System.out.println(max);
        System.out.print((maxPositionX+1)+" "+(maxPositionY+1));
    }

}