import java.util.*;


public class Main {

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        double result=0;double total=0;double score=0;
        for(int i=0;i<20;i++){
            String[] arr = sc.nextLine().split(" ");
            if( arr[2].equals("P")){
                continue;
            }
            total += Double.parseDouble(arr[1]);
            if(arr[2].equals("A+")) score=4.5;
            if(arr[2].equals("A0")) score=4.0;
            if(arr[2].equals("B+")) score=3.5;
            if(arr[2].equals("B0")) score=3.0;
            if(arr[2].equals("C+")) score=2.5;
            if(arr[2].equals("C0")) score=2.0;
            if(arr[2].equals("D+")) score=1.5;
            if(arr[2].equals("D0")) score=1.0;
            if(arr[2].equals("F")) score=0.0;

            result+=Double.parseDouble(arr[1])*score;
        }
        System.out.printf("%.6f\n", total==0?0:result/total);
    }
}