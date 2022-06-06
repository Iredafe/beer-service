package dafe.springframework.beerservice.Grokking;

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
//     List<List<String>> theVotes = Arrays.asList(Arrays.asList("ABC","ACB","ABC","ACB","ACB"));
    public static String rankTeamByVotes(List<List<String>> votes){
        HashMap<Character, int[]> ballot = new HashMap<>();
        int length = votes.get(0).get(0).length();
        votes.get(2);
        for(int i=0; i<votes.size();i++){
            for(int j = 0; j < length; j++){
                List<String> voteList= votes.get(i);
                String string = voteList.toString();
                char character = string.charAt(j);
                ballot.putIfAbsent(character, new int[length]);
                ballot.get(character)[j]++;
            }
        }

        List<Character> list = new ArrayList<>(ballot.keySet());
        Collections.sort(list, (a,b)->{
            for (int i=0; i<votes.size(); i++){
                if(ballot.get(a)[i]!=ballot.get(b)[i]){
                    return ballot.get(b)[i] - ballot.get(a)[i];  //sort in descending order
                }
            }
            return a-b; //returns 1 if a > b and returns -1 if b > a
        });

        StringBuilder sb = new StringBuilder();
        for(char character : list){
            sb.append(character);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String [] votes = {"ABC","ACB","ABC","ACB","ACB"};

       List <String> list1 = Arrays.asList("ABC");
       List <String> list2 = Arrays.asList("ACB");
       List <String> list3 = Arrays.asList("ABC");
       List <String> list4 = Arrays.asList("ACB");
       List <String> list5 = Arrays.asList("ACB");
        List<List<String>> theVotes =Arrays.asList(list1,list2,list3,list4,list5);

      //  System.out.println("The result of the vote is : " + rankTeam(votes));
        System.out.println("The result of the vote is : " + rankTeamByVotes(theVotes));
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
