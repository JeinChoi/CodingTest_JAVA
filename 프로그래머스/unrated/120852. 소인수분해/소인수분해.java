import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> ans = new ArrayList<>();
        int num = n;
         for(int i=2;i<=n;i++){
            if(num%i==0&&is_prime(i))
                ans.add(i);
        }
        if(ans.size()==0)
            ans.add(n);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
 public boolean is_prime(int number){
        if(number == 2) {
			return true;
		}
		
		for(int i = 2; i < number; i++) {
        	if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
    
}