import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        int answer=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int find = sc.nextInt();
        for(int i=0;i<n;i++){
            if(find==arr[i])
                answer++;
        }
        System.out.println(answer);

    }
}