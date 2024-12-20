import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {


    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        var br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr =new int[n];
        int[] difference = new int[n-1];

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int j=0;
        for(int i=1;i<n;i++){
            difference[j]=arr[i]-arr[i-1];
            j++;
        }
        Arrays.sort(difference);
        
        int result=0;
        for(int i=0;i<n-k;i++){
            result+=difference[i];
        }
        System.out.println(result);
    }
}