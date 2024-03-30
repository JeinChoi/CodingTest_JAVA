import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class Main {
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split("-");

        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s.charAt(0));
        }
        System.out.println(sb);
    }
}