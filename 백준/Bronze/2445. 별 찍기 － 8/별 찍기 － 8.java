import java.util.*;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String star="*";
        int n=sc.nextInt();
        int j=n-1;
        for(int i=1;i<n;i++){
            System.out.print(star.repeat(i));
            System.out.print(" ".repeat(j*2));
            System.out.println(star.repeat(i));
            j--;
        }
        System.out.println(star.repeat(n*2));
        j=1;
        for(int i=n-1;i>=0;i--){
            System.out.print(star.repeat(i));
            System.out.print(" ".repeat(j*2));
            System.out.println(star.repeat(i));
            j++;
        }

    }
}
