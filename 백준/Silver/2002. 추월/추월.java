import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(br.readLine());
        int count=0;int present=0;
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<N;i++){
            String str = br.readLine();
            hm.put(str,i);
         }
        
        
        String[] inputArr= new String[N];
        for(int i=0;i<N;i++){
            inputArr[i]=br.readLine();
        }
        for(int i=0;i<N-1;i++){
          for(int j=i+1;j<N;j++){
              if(hm.get(inputArr[i])>=hm.get(inputArr[j])) {
                  count++;
                  break;
              }
          }

        }

        System.out.println(count);
    }

}
