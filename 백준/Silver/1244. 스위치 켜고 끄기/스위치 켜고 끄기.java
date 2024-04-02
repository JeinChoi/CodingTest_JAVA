import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int N=sc.nextInt();

       int[] arr = new int[N];
       for(int i=0;i<N;i++){
           arr[i]=sc.nextInt();
       }

       int peopleNum=sc.nextInt();
       int standard=0;int gender=0;
        
       for(int i=0;i<peopleNum;i++){
           gender=sc.nextInt();
           standard=sc.nextInt();
           changeSwitch(gender,standard-1,arr);
       }
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
           if((i+1)%20==0)
               System.out.println();
       }
    }
    
static public void changeSwitch(int gender,int standard,int[] arr){
        switch (gender){
            case 1:
                for(int i=standard;i<arr.length;i+=(standard+1))
                    arr[i]=arr[i]==1?0:1;
                break;
            case 2:
                int left=standard-1;int right=standard+1;
                arr[standard]=arr[standard]==1?0:1;
                while(left>=0&&right<arr.length){

                    if(arr[left]==arr[right]){
                        arr[left]=arr[left]==1?0:1;
                        arr[right]=arr[right]==1?0:1;
                    }
                    else break;
                    left--;right++;
                }
                break;
        }
}
}