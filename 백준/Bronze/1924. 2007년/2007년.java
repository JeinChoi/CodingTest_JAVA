import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;
class Main {

    public static void main(String[] args) throws IOException {

        int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[2];
        int i=0; int total=0;
        while(st.hasMoreTokens()){
            arr[i]=Integer.parseInt(st.nextToken());
            i++;
        }
        for(int j=0;j<arr[0]-1;j++){
            total+=days[j];
        }
        total+=arr[1];
        System.out.println(week[total%7]);

    }
}
