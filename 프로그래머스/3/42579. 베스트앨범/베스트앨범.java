import java.util.*;
class Solution {
   public class Album{
        int idx;
        int play;
        public Album(int idx,int play){
            this.idx=idx;
            this.play=play;
        }
}
     public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<genres.length;i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }//map에 장르와 재생 횟수를 더해서 저장한다.
        ArrayList<String> mapToGenres = new ArrayList<>();
        for(String item: map.keySet()){
            mapToGenres.add(item);
        }//장르만 따로 저장한다
        mapToGenres.sort((o1,o2)->map.get(o2)-map.get(o1));
//장르를 정렬하는데 map에 있는 재생횟수를 기준 내림차순으로 정렬한다.


        for(String item:mapToGenres) {
            ArrayList<Album> albums = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                if (item.equals(genres[i])) {
                    albums.add(new Album(i, plays[i]));
                }
            }
            //genres 배열을 돌면서 인텍스와 해당 앨범의 재생횟수를 저장한다.
            //횟수가 제일 많은 장르 순으로 앨범의 인덱스와 재생횟수를 각각 저장하기 위함.
            albums.sort(new Comparator<Album>() {
                @Override
                public int compare(Album o1, Album o2) {
                    if (o1.play == o2.play) {
                        return o1.idx - o2.idx;
                    }
                    return o2.play - o1.play;
                }
            });
            //재생횟수를 기준으로 내림차순 한다.
            answer.add(albums.get(0).idx);//가장 횟수가 많은 앨범을 저장하고
            if (albums.size() != 1) {//같은 장르이면서 두번째로 횟수가 많은 앨범이 있다면 저장.
                answer.add(albums.get(1).idx);
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}