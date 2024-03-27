import java.util.*;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       Map<String,Integer> hm = new TreeMap<>();
       for(int i=0;i<num;i++){
           String[] arr = sc.next().split("\\.");
           hm.put(arr[1],hm.getOrDefault(arr[1],0)+1);
       }

       for(String key : hm.keySet()){
           System.out.println(key+" "+hm.get(key));
       }
    }
}