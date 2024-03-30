import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        char[] str = strArr[0].toCharArray();
        int formation=Integer.parseInt(strArr[1]);

        int j=0;//제곱 수
        long result=0;

        for(int i=str.length-1;i>=0;i--){
            if(str[i]>='0'&&str[i]<='9'){
                      result+= (long) (str[i] - '0') *(int)Math.pow(formation,j);
            }else {
                result+= (long) (str[i] - 'A' + 10) *(int) Math.pow(formation,j);
            }
            j++;
        }
        System.out.println(result);
    }
}
