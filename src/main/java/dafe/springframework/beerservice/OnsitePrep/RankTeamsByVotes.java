package dafe.springframework.beerservice.OnsitePrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return "";
    }

    public static void main(String[] args) {
        String [] votes = {"ABC","ACB","ABC","ACB","ACB"};
        System.out.println("This is the teams vote rank : " + rankTeamByVote(votes));
    }
}
