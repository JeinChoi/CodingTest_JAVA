class Solution {
    public long solution(String numbers) {
       StringBuilder answerStr=new StringBuilder();
        int[] nums = {4,3,3,5,4,4,3,5,5,4};
        int i=0;

        String[] numStr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        while (numbers.length()>0){
            for(int j=0;j<numStr.length;j++){
                if(numbers.substring(0,2).equals(numStr[j].substring(0,2))) {
                    i = j;
                    break;
                }
            }
            answerStr.append(i+"");
            numbers=numbers.substring(nums[i]);

        }
        return Long.parseLong(answerStr.toString());
    }
}