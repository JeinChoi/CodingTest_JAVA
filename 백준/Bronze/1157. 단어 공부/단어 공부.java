import java.util.*;


public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       String input = sc.next();
       char[] inputArr = input.toCharArray();
       Map<Character,Integer> map = new HashMap<>();
       for(char letter : inputArr){
           char lower = letter<=90?(char)(letter+32):letter;
           map.put(lower,map.getOrDefault(lower,0)+1);
       }
        List<Character> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (v2, v1) -> (map.get(v1).compareTo(map.get(v2))));

        if(keys.size()>=2 && map.get(keys.get(0)).equals(map.get(keys.get(1))))
            System.out.println("?");
        else System.out.println((char)(keys.get(0)-32));
    }
}