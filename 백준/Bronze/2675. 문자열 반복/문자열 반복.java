import java.util.*;
public class Main{ 
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int mul=sc.nextInt();
            String str = sc.next();
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<str.length();j++){
                sb.append((str.charAt(j)+"").repeat(mul));
            }
            System.out.println(sb.toString());
        }

    }
}