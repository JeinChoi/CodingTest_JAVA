import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
/*
* 조합문제??
* 4,7,10을 1,2,3으로 구할 수 있는 경우의 수를 구한다
* 예를들어 4인 경우 (1,1,1,1) (1,1,2) (2,1,1) (1,2,1) (2,2) (1,3) (3,1)
* 순서를 따진다
*
* */
    static int[] result=new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            
            int input=Integer.parseInt(br.readLine());

            sb.append(find(input)).append("\n");
        }
        System.out.println(sb);

    }
    static int find(int input){
        result[0] = 1;
        result[1] = 2;
        result[2] = 4;

        for(int i=3;i<input;i++){
            result[i]=result[i-1]+result[i-2]+result[i-3];
        }
        return result[input-1];
    }

}