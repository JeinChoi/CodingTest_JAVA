import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
/*
*  핵심 문장 : "각자 기다려야 하는 시간" 
*  1. 각자 기다려야 하는 시간을 구하기 위해 (자신 차례의 앞에 있는 사람들이 할애한 시간) + (자신의 인출 시간).
*  2. 모든 사람들이 기다린 시간을 알기 위해 누적 합을 한다. 
*
* */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] intArr = new int[N];

        for(int i=0;i<N;i++){
            intArr[i]=Integer.parseInt(arr[i]);
        }

        Arrays.sort(intArr);


        int result=0;
        int sum=0;

        for(int i=0;i<N;i++){

            result+=sum+intArr[i];
            sum+=intArr[i];

        }
        System.out.println(result);

    }

}
