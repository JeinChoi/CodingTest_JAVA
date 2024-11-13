
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            String[] strArr = br.readLine().split(" ");
            
            int m = Integer.parseInt(strArr[0]);
            int strLength = strArr[1].length();

            for(int j=0;j<strLength;j++){
               sb.append((strArr[1].charAt(j)+"").repeat(m));
            }
            System.out.println(sb);
            sb.setLength(0);
        }

    }
}
