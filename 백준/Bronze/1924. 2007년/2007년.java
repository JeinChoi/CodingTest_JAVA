import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[] month={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] week={"MON","TUE","WED","THU","FRI","SAT","SUN"};
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();int y=sc.nextInt();
        int days=0;
        for(int i=0;i<x-1;i++){
            days+=month[i];
        }days+=y-1;        
        System.out.println(week[days%7]);
    }
}