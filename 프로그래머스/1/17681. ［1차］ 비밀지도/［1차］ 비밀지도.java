class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[] arr3 = new int[n];
        String[] answer = new String[n];
        for(int i=0;i< n;i++){
            arr3[i]=arr1[i]|arr2[i];
        }
        String[] arr3ToStr = new String[n];
        for(int i=0;i<n;i++){
            String temp = String.format("%0"+n+"d",Long.parseLong(Integer.toBinaryString(arr3[i])));
            arr3ToStr[i]=temp;
        }
        StringBuilder sb;
        for(int i=0;i<n;i++){
            sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(arr3ToStr[i].charAt(j)=='1'?"#":" ");
            }
            answer[i]=sb.toString();
        }

        return answer;
    }
}