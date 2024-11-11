import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr= Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        if (arr[0]==arr[1] && arr[1]==arr[2]) {
            System.out.println(10000+ arr[0]*1000);
        }
        else if((arr[0]!=arr[1] && arr[0]==arr[2] )
                || (arr[0]!=arr[2] && arr[0]==arr[1])){
            System.out.println(1000+ arr[0]*100);
        }
        else if(arr[1]==arr[2]&&arr[1]!=arr[0]){
            System.out.println(1000+ arr[1]*100);
        }
        else{
            System.out.println(Math.max(Math.max(arr[0],arr[1]),arr[2])*100);
        }
    }
}