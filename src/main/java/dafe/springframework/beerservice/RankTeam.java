package dafe.springframework.beerservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RankTeam {

    private static String rankTeam(List<List<String>> votes){

        return "";
    }
    /*
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

    votes -> [XYZ, XZY, XZY, XYZ, XZY, XYZ]
       X : 6, 0, 0
       Y : 0, 3, 3
       Z : 0, 3, 3

       Ans : XYZ

     */

    public static void main(String [] args){
        List<String> voteList = new ArrayList<>();
        voteList.add("XYZ");
        voteList.add("XZY");
        voteList.add("XZY");
        voteList.add("XYZ");
        voteList.add("XZY");
        voteList.add("XYZ");
        List<List<String>> votes = Arrays.asList(voteList);

        System.out.println("This is the winner of vote in order of 1st, 2nd and 3rd : " + rankTeam(votes));
    }

}
