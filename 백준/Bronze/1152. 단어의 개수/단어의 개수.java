import java.util.*;


public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int len=0;

        while(st.hasMoreTokens()){
            len++;
            st.nextToken();
        }
        System.out.println(len);
    }
}
