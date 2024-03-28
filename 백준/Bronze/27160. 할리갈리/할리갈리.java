import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        boolean five=false;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<people;i++){
            String card = sc.next();
            int num = sc.nextInt();
            map.put(card,map.getOrDefault(card,0)+num);
        }
        for(String key: map.keySet())
            if(map.get(key)==5)
                five=true;
        
        System.out.println(five?"YES":"NO");
        
    }
}