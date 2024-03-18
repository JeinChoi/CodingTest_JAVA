import java.lang.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {
        int answer=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            if(input==0)
                st.pop();
            else st.push(input);
        }
      while(!st.isEmpty()){
          answer+=st.pop();
      }
        System.out.println(answer);

    }

}




