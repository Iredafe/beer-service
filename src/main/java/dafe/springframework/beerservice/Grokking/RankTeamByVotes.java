package dafe.springframework.beerservice.Grokking;

import java.lang.reflect.Array;
import java.util.*;

public class RankTeamByVotes {

    private static String rankTeam(String [] votes){

        int length = votes[0].length();
        Map<Character, int[]> votingEngine = new HashMap<>();
        for(String vote : votes){
            for(int index=0; index<length; index++){
                char character = vote.charAt(index);
                votingEngine.putIfAbsent(character, new int[length]);
                votingEngine.get(character)[index]++;
            }
        }

        List<Character> list = new ArrayList<>(votingEngine.keySet());

        list.sort((a, b) -> {
            for (int i = 0; i < length; i++) {
                if (votingEngine.get(a)[i] != votingEngine.get(b)[i]) {
                    return votingEngine.get(b)[i] - votingEngine.get(a)[i];
                }
            }
            return a - b;
        });

        StringBuilder stringBuilder = new StringBuilder();
        for(char character : list){
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        String [] votes = {"ABC","ACB","ABC","ACB","ACB"};

        System.out.println("The result of the vote is : " + rankTeam(votes));
    }

     /*
vote index-> 0  1  2
     team A :5  0  0
     team B :0  2  3
     team C :0  3  2

 map :       A :[5,  0,  0]
             B :[0,  2,  3]
             C :[0,  3,  2]
sort according to frequency of votes
first-> A, second-> B, third -> C
     */
}
