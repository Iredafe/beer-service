package dafe.springframework.beerservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RankTeam {

    private static String rankTeam(List<List<String>> votes){
        HashMap<Character, Integer> voteCountMap = new HashMap<>();
        return "";
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
        List<String> voteList = new ArrayList<>();
        voteList.add("XYZ");
        voteList.add("XZY");
        voteList.add("XZY");
        voteList.add("XYZ");
        voteList.add("XZY");
        voteList.add("XYZ");
        List<List<String>> votes = Arrays.asList(voteList);

        System.out.println("0 :-> This is the winner of vote in order of 1st, 2nd and 3rd : " + rankTeam(votes));
        //XYZ, ZYX, YXZ, XZY, XYZ
        List<String> voteList1 = new ArrayList<>();
        voteList.add("XYZ");
        voteList.add("ZYX");
        voteList.add("YXZ");
        voteList.add("XZY");
        voteList.add("XYZ");
        List<List<String>> votes1 = Arrays.asList(voteList1);

        System.out.println("1 :-> This is the winner of vote1 in order of 1st, 2nd and 3rd : " + rankTeam(votes1));
        //XYZ, YXZ, YXZ, YZX, XYZ
        List<String> voteList2 = new ArrayList<>();
        voteList.add("XYZ");
        voteList.add("YXZ");
        voteList.add("YXZ");
        voteList.add("YZX");
        voteList.add("XYZ");
        List<List<String>> votes2 = Arrays.asList(voteList2);

        System.out.println("2 :-> This is the winner of vote2 in order of 1st, 2nd and 3rd : " + rankTeam(votes2));


    }

}
