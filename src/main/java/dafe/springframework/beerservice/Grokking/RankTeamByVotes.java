package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.Map;

public class RankTeamByVotes {

    private static String rankTeam(String [] votes){

        int length = votes[0].length();
        Map<String, Integer> votingEngine = new HashMap<>();
        for(String vote : votes){
            for(int index=0; index<length; index++){

            }
        }
        return "";
    }

    public static void main(String[] args) {

        String [] votes = {"ABC","ACB","ABC","ACB","ACB"};

        System.out.println("The result of the vote is : " + rankTeam(votes));
    }
}
