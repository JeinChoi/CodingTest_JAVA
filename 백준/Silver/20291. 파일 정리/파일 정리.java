import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<num;i++){
            String[] str = br.readLine().split("\\.");
            map.put(str[1],map.getOrDefault(str[1],0)+1);

        }
        List<String> ll = new LinkedList<>(map.keySet());
        Collections.sort(ll);

        for(String key : ll){
            System.out.println(key+" "+map.get(key));
        }
    }
}