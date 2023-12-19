import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
         int[] find=new int[dic.length];
        for(int i=0;i<dic.length;i++){
            int[] check=new int [spell.length];
            for(int j=0;j<dic[i].length();j++){
                for(int k=0;k<spell.length;k++){
                    if((dic[i].charAt(j)+"").equals(spell[k])){
                        check[k]++;
                    }
                }
            }
            if(Arrays.stream(check).allMatch(a->a==1))
                find[i]=1;
        }
           if (Arrays.stream(find).anyMatch(a->a==1))
               return 1;
           else return 2;
    }
}