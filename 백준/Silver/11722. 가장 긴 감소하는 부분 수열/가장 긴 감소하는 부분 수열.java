import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[] arr=new int[50];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] str = br.readLine().split(" ");

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
        }

        int[] memo = new int[n];
        memo[0]=1;

        for(int i=0;i<n;i++){
            memo[i]=1;
            //System.out.println("[[[[[[[[[[[[현재 i "+i+"]]]]]]]]]");
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j]){
              //      System.out.println("현재 i 와 j "+arr[i]+" "+arr[j]);
                //    System.out.println("memo 값 "+memo[i]+" "+(memo[j]+1));
                    memo[i]=Math.max(memo[i],memo[j]+1);

                }
            }
        }
        int answer = Arrays.stream(memo).max().getAsInt();
        System.out.println(answer);
    }


}