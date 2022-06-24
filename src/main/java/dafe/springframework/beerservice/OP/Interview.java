package dafe.springframework.beerservice.OP;

// Step 1)
//
// Imagine an Airbnb-like vacation rental service, where users in different cities can exchange their apartment with
// another user for a week. Each user compiles a wishlist of the apartments they like. These wishlists are ordered,
// so the top apartment on a wishlist is that user's first choice for where they would like to spend a vacation.
// You will be asked to write part of the code that will help an algorithm find pairs of users who would like to
// swap with each other.
//
// Given a set of users, each with an *ordered* wishlist of other users' apartments:
//
// a's wishlist: c d
// b's wishlist: d a c
// c's wishlist: a b
// d's wishlist: c a b
//
// The first user in each wishlist is the user's first-choice for whose apartment they would like to swap into.
// Write a function called hasMutualFirstChoice() which takes a username and returns true if that user and
// another user are each other's first choice, and otherwise returns false.
//
// hasMutualFirstChoice('a') // true (a and c)
// hasMutualFirstChoice('b') // false (b's first choice does not *mutually* consider b as their first choice)
//
// Then expand the base case beyond just "first" choices, to include all "mutually ranked choices". Write another
// function which takes a username and an option called "rank" to indicate the wishlist rank to query on. If given
// a rank of 0, you should check for a first choice pair, as before. If given 1, you should check for a pair of
// users who are each others' second-choice. Call your new function hasMutualPairForRank() and when done,
// refactor hasMutualFirstChoice() to depend on your new function.
//
// hasMutualPairForRank('a', 0) // true (a and c)
// hasMutualPairForRank('a', 1) // true (a and d are mutually each others' second-choice)


import java.util.*;

class Tests {
    public static Map<String, String[]> data () {
        Map<String, String[]> data = new HashMap<String, String[]>();
        data.put("a", new String[] {"c", "d"});
        data.put("b", new String[] {"d", "a", "c"});
        data.put("c", new String[] {"a", "b"});
        data.put("d", new String[] {"c", "a", "b"});
        return data;
    }

    public static void assertEqual(boolean actual, boolean expected) {
        if (expected == actual) {
            System.out.println("PASSED");
        } else {
            throw new AssertionError(
                    "Expected:\n  " + expected +
                            "\nActual:\n  " + actual +
                            "\n");
        }
    }

    public static void assertEqual(String[] actual, String expected[]) {
        if (!String.join(",", expected).equals(String.join(",", actual))) {
            throw new AssertionError(
                    "Expected:\n  " + String.join(",", expected) +
                            "\nActual:\n  " + String.join(",", actual) +
                            "\n");
        }
        System.out.println("PASSED");
    }

    public static void testHasMutualFirstChoice() {
        assertEqual(new Solution(data()).hasMutualFirstChoice("a"), true);
        assertEqual(new Solution(data()).hasMutualFirstChoice("b"), false);
    }

    public static void testHasMutualPairForRank() {
        assertEqual(new Solution(data()).hasMutualPairForRank("a", 0), true);
        assertEqual(new Solution(data()).hasMutualPairForRank("a", 1), true);
    }
}

class Solution {

    Map<String, String[]> data;
    public Solution(Map<String, String[]> data) {
        this.data = data;
    }
//get input
    //check the first element and look through the first item in the wishlist
    //check the map for the username referenced in the input's first item
    //compare the first in that reference to see if it equals the input
//public boolean hasMutualFirstChoice(String username) {
//
//    String [] choices = data.get(username);
//    String firstChoice = choices[0];
//    String [] referenceChoices = data.get(firstChoice);
//    String firstItemInReferenceChoice = referenceChoices[0];
//
//    if(username.equals(firstItemInReferenceChoice)) return true;
//    return false;
//}

public boolean hasMutualFirstChoice(String username) {
    boolean firstChoiceRank = true;
    int rank = firstChoiceRank ? 0 : 1;
    return hasMutualPairForRank(username, rank);
}

    public boolean hasMutualPairForRank(String username, int rank) {
        String [] choices = data.get(username);
        String myRank = choices[rank];
        String [] referenceRanks = data.get(myRank);
        String itemInReferenceChoices = referenceRanks[rank];
        return username.equals(itemInReferenceChoices);
    }

    public static void main(String[] args) {
        Tests.testHasMutualFirstChoice();
        Tests.testHasMutualPairForRank();
    }
}