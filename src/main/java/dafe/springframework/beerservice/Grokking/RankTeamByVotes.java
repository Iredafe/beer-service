package dafe.springframework.beerservice.Grokking;

import java.lang.reflect.Array;
import java.util.*;

public class RankTeamByVotes {

    private static String rankTeam(String [] votes){

        int length = votes[0].length();
        Map<String, int[]> votingEngine = new HashMap<>();
        for(String vote : votes){
            for(int index=0; index<length; index++){
                votingEngine.putIfAbsent(vote, new int[length]);
                votingEngine.get(vote)[index]++;
            }
        }

        List<String> list = new ArrayList<>(votingEngine.keySet());

        Collections.sort(list,(a,b)->{
            for(int i=0; i<length; i++){

            }
        });
        return "";
    }

    public static void main(String[] args) {

        String [] votes = {"ABC","ACB","ABC","ACB","ACB"};

        System.out.println("The result of the vote is : " + rankTeam(votes));
    }
}
