import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
/*
*1.
*
*
* */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(br.readLine());
        int result=0;
      
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<N;i++){

            result=1;
            int kinds=Integer.parseInt(br.readLine());

            for(int j=0;j<kinds;j++){
                String[] input = br.readLine().split(" ");
                hm.put(input[1],hm.getOrDefault(input[1],0)+1);
            }
            
            for(String key:hm.keySet()){
                result*=(hm.get(key)+1);
            }

            System.out.println(--result);

            hm.clear();
        }
    }

}
