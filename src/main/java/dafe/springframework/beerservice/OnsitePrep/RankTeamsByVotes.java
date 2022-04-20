package dafe.springframework.beerservice.OnsitePrep;

import java.util.HashMap;
import java.util.Map;

public class RankTeamsByVotes {

    private static String rankTeamByVote(String [] votes){
        Map<Character, int[]> map = new HashMap<>();

        return "";
    }

    public static void main(String[] args) {
        String [] votes = {"ABC","ACB","ABC","ACB","ACB"};
        System.out.println("This is the teams vote rank : " + rankTeamByVote(votes));
    }
}
