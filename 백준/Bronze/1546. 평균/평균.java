import java.util.*;

public class Main {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
       int num=sc.nextInt();double total=0;
       double maxScore = -9999;
       for(int i=0;i<num;i++){
           double score=sc.nextDouble();
           total+=score;
           if(score>maxScore)
               maxScore=score;
       }
       double average= total/maxScore*100/num;
        //System.out.printf("%f",average);
        System.out.println(average);
    }
}