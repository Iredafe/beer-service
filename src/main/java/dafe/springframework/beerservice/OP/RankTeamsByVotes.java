package dafe.springframework.beerservice.OP;

import java.util.*;

public class RankTeamsByVotes {

    private static String rankTeamByVote(String [] votes){
        Map<Character, int[]> map = new HashMap<>();
        int length = votes[0].length();
        for(String vote : votes){
            for(int i=0; i<length; i++){
                char character = vote.charAt(i);
                map.putIfAbsent(character, new int[length]);
                map.get(character)[i]++;
            }
        }

        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b)->{
            for(int i=0; i<length; i++){
                if(map.get(a)[i] != map.get(b)[i]){
                    return map.get(b)[i] - map.get(a)[i];
                }
            }
            return a-b;
        });

        StringBuilder sb = new StringBuilder();
        for(char character: list){
            sb.append(character);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String [] votes = {"ABC","ACB","ABC","ACB","ACB"};
        System.out.println("This is the teams vote rank : " + rankTeamByVote(votes));
    }
}
