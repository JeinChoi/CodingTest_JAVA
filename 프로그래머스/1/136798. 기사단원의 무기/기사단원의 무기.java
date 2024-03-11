import java.util.*;
class Solution {
  static public int solution(int number, int limit, int power) {
       int[] a = new int[number];
        for(int i=1;i<=number;i++){
            int temp=howMany(i);
            a[i-1]=(temp>limit)?power:temp;
        }
        return Arrays.stream(a).sum();
    }
    static public int howMany(int n){
        int num=0;
        for(int i=1;i*i<=n;i++){
            if(i*i==n)
                num++;
            else if(n%i==0)
                num+=2;
             
        }
        return num;
    }
}