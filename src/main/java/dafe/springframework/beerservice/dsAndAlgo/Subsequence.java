package dafe.springframework.beerservice.dsAndAlgo;

import com.fasterxml.jackson.annotation.JsonSubTypes;

/*
Given two strings s and t, check if s is a subsequence of t.

 */
public class Subsequence {

    public static boolean isSubsequence(String s, String t){

        int n = s.length();
        int m = t.length();
        int j=0;
        for(int i=0; i<m; i++){
            if(j<n && s.charAt(j) == t.charAt(i)){
                j++;
            }
        }

        if(j==n) return true;
        else return false;
    }


    public static void main(String[] args) {

        String s = "abc", t = "ahbgdc";
        String u = "axc", v = "ahbgdc";

        System.out.println("The string is a subsequence : " + isSubsequence(s, t));
        System.out.println("The string is subsequence : " + isSubsequence(u, v));

    }

}

