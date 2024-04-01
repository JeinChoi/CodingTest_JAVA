
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int height= input[0];  int width= input[1];

        int[][] arr = new int[height][width];

        for(int i=0;i<height;i++){
                arr[i]=Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[][] inputArr = new int[height][width];
        for(int i=0;i<height;i++){
            inputArr[i]=Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j=0;j<width;j++){
                arr[i][j]+=inputArr[i][j];
            }
        }

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}