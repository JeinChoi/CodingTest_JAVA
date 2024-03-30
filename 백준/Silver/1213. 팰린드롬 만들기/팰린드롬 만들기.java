import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] letterNumArr = new char[26];

        for(int i=0;i<str.length();i++){
            letterNumArr[str.charAt(i)-'A']++;
        }

        int odd=0;
        int center=0;
        for (int i=0;i<letterNumArr.length;i++) {
            if (letterNumArr[i] % 2 != 0) {
                odd++;
                center=i;
            }
        }

        if(odd>1 || (odd==1 && str.length()%2==0)){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder result = new StringBuilder();
        for(int i=0;i<letterNumArr.length;i++){
            for(int j=0;j<letterNumArr[i]/2;j++){
                result.append((char)(i+'A'));
            }
        }
        
        StringBuffer tmp = new StringBuffer(result.toString());
        if(odd==1){
            result.append((char)(center+'A'));
        }
        System.out.println(result.toString()+tmp.reverse());

    }
}
