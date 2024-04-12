import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            if(n==find(i)){
                System.out.println(i);
                return;
            }
        }
        System.out.println("0");

    }

    static int find(int input){
        int n=input;
        int num=0;
        while(n!=0){
            num+=n%10;
            n/=10;
        }
        return num+input;

    }

}