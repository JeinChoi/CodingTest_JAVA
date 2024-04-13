import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
1원으로 1원부터 10원까지 구하는 경우의 수는 각각 한개씩이다
2원으로 1원부터 10원까지 구하는 경우의 수
예를들어 7원을 구하는 경우. 
for문을 보면 인덱스를 memo[7-2] 즉 memo[5]의 경우의 수를 추가하는 것을 알 수 있다
현재 5의 경우의 수는 3으로 (1,1,1,1,1),(1,2,2),(1,1,1,2) 이렇게 구성돼 있다 
7은 여기서 2원을 더 추가한 경우다 
그러므로 경우가 (1,1,1,1,1,1,1),(1,1,1,1,1)+(2),(1,2,2)+(2),(1,1,1,2)+2 
5의 경우에서 2가 추가가 되는 식이다. 그러므로 5의 경우의수를 추가해 주는 것이
답이 될 수 있다.
2를 빼는 이유는 2원 단위가 추가가 된 것이기 때문이다..
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int total=Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] memo = new int[total+1];
        memo[0]=1;

        for(int i=1;i<=n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=1;i<=n;i++){
            for(int j=arr[i];j<=total;j++){
                memo[j]+=memo[j-arr[i]];
            }//코인 5원 이라고 하면 5원 이전에는 5원으로 경우의수를 
            //만들 수 없으니까 5원부터 구하려는 값까지 for문을 돌려야 한다
            //예를들어 원래 1,2원으로 5를 구하는 경우는 (1,1,1,1,1),(1,2,2),(2,1,1,1)이다
            //그런데 5원이 추가가 되어서 경우의 수가 5원 하나인 경우가 추가 되어 4가 된다
           
        } System.out.println(memo[total]);

    }

}