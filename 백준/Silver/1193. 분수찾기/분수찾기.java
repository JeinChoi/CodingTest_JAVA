import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        int floor=0;
        int sum=0;
        do {
            sum += floor;
            floor++;
        } while (num > sum + floor);
      
        int spare = num-sum;
        int mom=0;int son=0;
        boolean even = floor%2==0;
        if(even){
            son=1;
            mom=floor;
        }else{
            son=floor;
            mom=1;
        }
        for(int i=1;i<spare;i++){
            if(even){
                son++;mom--;
            }
            else {
                son--;mom++;
            }
        }
        System.out.println(son+"/"+mom);
        
    }
}
