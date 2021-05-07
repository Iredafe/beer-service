package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

/*
You're given strings jewels representing the types of stones that are jewels,
and stones representing the stones you have. Each character in stones is a type
of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/

    public static int numJewelsInStones(String jewels, String stones) {

        Set<Character> myHashSet = new HashSet<>();
        int count = 0;
        for(int i=0; i<jewels.length(); i++){
         myHashSet.add(jewels.charAt(i));
        }
        String duplicates ="";
        for(int i=0; i<stones.length();i++){
            if(myHashSet.contains(stones.charAt(i))){
                count++;
                 duplicates+= stones.charAt(i);
               }
        }
        System.out.println("These are the duplicates : " +duplicates );

        return count;
    }


    public static void main(String[] args) {
        String myJewels = "pioewn";
        String myStones ="opitetknfdl";
        System.out.println("This is the number of jewels and stones : " + numJewelsInStones(myJewels, myStones));
    }
}