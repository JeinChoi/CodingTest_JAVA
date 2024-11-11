import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i=1;i<=num;i++){
            sb.append("*".repeat(Math.max(0, i)));
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
   }
