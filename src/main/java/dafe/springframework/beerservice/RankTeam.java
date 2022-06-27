package dafe.springframework.beerservice;

import java.util.*;

public class RankTeam {

    private static String rankTeam(List<List<String>> votes){
        HashMap<Character, int[]> voteCountMap = new HashMap<>();
        int numberOfCandidates = votes.get(0).get(0).length();
        for(int voteIndex=0; voteIndex<votes.size() ; voteIndex++){
            List<String> vote = votes.get(voteIndex);
            String voteString = String.join("", vote);
            for(int indexOfVoteCandidate=0; indexOfVoteCandidate<numberOfCandidates; indexOfVoteCandidate++){

                Character voteCharacter = voteString.charAt(indexOfVoteCandidate);
                if(!voteCountMap.containsKey(voteCharacter)){
                    voteCountMap.put(voteCharacter, new int[numberOfCandidates]);
                }
                    voteCountMap.get(voteCharacter)[indexOfVoteCandidate]++;
            }
        }

        List<Character> voteList = new ArrayList<>(voteCountMap.keySet());
        Collections.sort(voteList, (a,b)->{
            for(int listIndex=0; listIndex<voteList.size(); listIndex++){
                if(voteCountMap.get(a)[listIndex] != voteCountMap.get(b)[listIndex]){
                    return voteCountMap.get(b)[listIndex] - voteCountMap.get(a)[listIndex];
                }
            }
            return a-b;
        });

        StringBuilder voteResult = new StringBuilder();
        for(char voteCandidate : voteList){
            voteResult.append(voteCandidate);
        }
        return voteResult.toString();
    }
    /*
    votes -> [XYZ, XZY, XZY, XYZ, XZY, XYZ]
       X : 6, 0, 0
       Y : 0, 3, 3
       Z : 0, 3, 3

       Ans : XYZ

    votes -> [XYZ, ZYX, YXZ, XZY, XYZ]

    X : 3, 1, 1
    Y : 1, 3, 1
    Z : 1, 1, 3

    Ans : XYZ

    votes -> [XYZ, YXZ, YXZ, YZX, XYZ]
    X : 2, 2, 1
    Y : 3, 2, 0
    Z : 0, 1, 4

    Ans : YXZ

     */

    public static void main(String [] args){

        //XYZ, XZY, XZY, XYZ, XZY, XYZ
//        List<String> voteList1 = new ArrayList<>();
//        voteList1.add("XYZ");
//        voteList1.add("XZY");
//        voteList1.add("XZY");
//        voteList1.add("XYZ");
//        voteList1.add("XZY");
//        voteList1.add("XYZ");
//        List<List<String>> votes = Arrays.asList(voteList1);
//
 //       System.out.println("0 :-> This is the winner of vote in order of 1st, 2nd and 3rd : " + rankTeam(votes));
        //XYZ, ZYX, YXZ, XZY, XYZ
//        List<String> voteList = new ArrayList<>();
//        voteList.add("XYZ");
//        voteList.add("ZYX");
//        voteList.add("YXZ");
//        voteList.add("XZY");
//        voteList.add("XYZ");
//        List<List<String>> votes1 = Arrays.asList(Arrays.asList("XYZ"),Arrays.asList("ZYX"),
//                Arrays.asList("YXZ"),Arrays.asList("XZY"),Arrays.asList("XYZ"));

  //      System.out.println("1 :-> This is the winner of vote1 in order of 1st, 2nd and 3rd : " + rankTeam(votes1));

List<List<String>> voters = Arrays.asList(Arrays.asList("WXYZ"), Arrays.asList("XYZW"));
        System.out.println(rankTeam(voters));


        //XYZ, YXZ, YXZ, YZX, XYZ
//
//        List<List<String>> votes2 = Arrays.asList(Arrays.asList("XYZ"),Arrays.asList("YXZ"),
//                Arrays.asList("YXZ"),Arrays.asList("YZX"),Arrays.asList("XYZ"));
//
//
//        System.out.println("2 :-> This is the winner of vote2 in order of 1st, 2nd and 3rd : " + rankTeam(votes2));
//

    }

}
