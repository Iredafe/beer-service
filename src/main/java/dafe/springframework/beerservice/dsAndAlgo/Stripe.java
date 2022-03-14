package dafe.springframework.beerservice.dsAndAlgo;

import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

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

    class Tests {
        public static Map<String, String[]> data () {
            Map<String, String[]> data = new HashMap<String, String[]>();
            data.put("a", new String[] {"c", "d"});
            data.put("b", new String[] {"d", "a", "c"});
            data.put("c", new String[] {"a", "b"});
            data.put("d", new String[] {"c", "a", "b"});
            return data;
        }
}
