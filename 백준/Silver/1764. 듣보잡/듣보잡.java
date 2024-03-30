
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tempArr = br.readLine().split(" ");
        int N = Integer.parseInt(tempArr[0]);
        int M = Integer.parseInt(tempArr[1]);

        Set<String> se = new TreeSet<>();
        Map<String,Integer> nameMap = new HashMap<>();

        for(int i=0;i<N;i++){
            nameMap.put(br.readLine(),1);
        }
        for(int i=0;i<M;i++){
            String name=br.readLine();
            if(nameMap.get(name)==null) continue;
            else if(nameMap.get(name)==1)se.add(name);

        }

        System.out.println(se.size());
        for(String one: se){
            System.out.println(one);
        }

    }
}