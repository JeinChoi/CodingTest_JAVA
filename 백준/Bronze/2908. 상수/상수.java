import java.util.*;


public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       StringBuilder first =new StringBuilder(sc.next());
       StringBuilder second=new StringBuilder(sc.next());

        String firstStr = first.reverse().toString();
        String secondStr = second.reverse().toString();

        if(Integer.parseInt(firstStr)
                >Integer.parseInt(secondStr))
            System.out.println(firstStr);
        else System.out.println(secondStr);

    }
}