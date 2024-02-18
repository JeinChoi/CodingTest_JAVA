class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int startX=51,startY=51;
        int endX=-51,endY=-51;
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[i].length();j++)
                if(wallpaper[i].charAt(j)=='#'){
                    if(i<startX)
                        startX=i;
                    if(j<startY)
                        startY=j;
                    if(i>endX)
                        endX=i;
                    if(j>endY)
                        endY=j;
                }
        }
        return new int[]{startX,startY,endX+1,endY+1};
    }
}