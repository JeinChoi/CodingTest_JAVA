import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
         for(int i=0;i<a.length();i++) {
            int temp = a.charAt(i);
            if (temp >= 65 && temp <= 90) {
                System.out.print((char) (temp + 32));
            }
            if (temp >= 97 && temp <= 122) {
                System.out.print((char) (temp - 32));
            }
        }
    }
}