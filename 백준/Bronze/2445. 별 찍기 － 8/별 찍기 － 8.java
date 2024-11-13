
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int total = n*2;
        for(int i=0;i<n;i++){
                int star = i+1;
                sb.append("*".repeat(star));
                sb.append(" ".repeat(total-star*2));
                sb.append("*".repeat(star));

                System.out.println(sb);
                sb.setLength(0);
        }
        for(int i=n-1;i>0;i--){
            int star=i;
            sb.append("*".repeat(star));
            sb.append(" ".repeat(total-star*2));
            sb.append("*".repeat(star));

            System.out.println(sb);
            sb.setLength(0);

        }
    }
}
