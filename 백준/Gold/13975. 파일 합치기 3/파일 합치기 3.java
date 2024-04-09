import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static long cost=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
       int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            cost=0;
            int num = Integer.parseInt(br.readLine());
            PriorityQueue<Long> nums = new PriorityQueue<>();

            st = new StringTokenizer(br.readLine());
            for(int j=0;j<num;j++){
                nums.add(Long.parseLong(st.nextToken()));
            }
            find(nums);
        }

    }
    public static void find(PriorityQueue<Long> nums){
        long first = nums.poll();
        long second = nums.poll();
        nums.add(first+second);
        cost+=(first+second);
        if(nums.size()>1)
            find(nums);
        else {
            System.out.println(cost);
            return;
        }
    }
}