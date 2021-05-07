package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Interview {
    //problem statement
    //method that takes 2 input strings
    //returns the common characters
    //it is case insensitive
    //output is a string

    //solution plan
    //create a public method
    //make the method signature a string
    //make the 2 arguments of type string
    //convert the strings to a charArray
    //compare or do a lookup to find matching characters
    //if the characters match, save in a variable and return the variable
    //if there are no matching characters return an empty string
    //convert the variable back to string

    public static String compareTwoStrings(String input1, String input2){

        char [] firstInput = input1.toCharArray();
        char [] secondInput = input2.toCharArray();
        String commonCharacters="";

        for(int i=0; i<firstInput.length; i++){
            for(int j=0; j<secondInput.length; j++){
                if(firstInput[i]==secondInput[j]){
                    commonCharacters += firstInput[i];
                }
            }


        }

        return commonCharacters;
    }

    //using a hashset
    public static String commonCharacters(String input1, String input2){

        String duplicateCharacters="";
        char []firstString = input1.toCharArray();
        char [] secondString = input2.toCharArray();
        HashSet<Character> set1 = new HashSet<>();
        for(char n : firstString){
            set1.add(n);
        }
        HashSet<Character> set2 = new HashSet<>();
        for(char n : secondString){
            set2.add(n);
        }

        set1.retainAll(set2);
        char [] newArray = new char[set1.size()];
        int index=0;
        for(char n:set1){
            newArray[index++]= n;
        }
            duplicateCharacters= Arrays.toString(newArray);

        return duplicateCharacters;
    }

    public static String findDuplicatesWithOneHashSet(String input1, String input2){

        HashSet<Character> myHashSet = new HashSet<>();
        String duplicates = "";
        for(int i=0; i<input2.length(); i++){
            myHashSet.add(input2.charAt(i));
        }

        for (int i=0; i<input1.length(); i++){
            if(myHashSet.contains(input1.charAt(i))){
                duplicates += input1.charAt(i);
            }
        }
        return duplicates;
    }



    public static void main(String[] args) {

        String myFirstString = "abuyrt";
        String mySecondString = "ravusye";
        String myThirdString = "ppoipo";
        System.out.println("These are the matching characters : " + compareTwoStrings(myFirstString, mySecondString));
        System.out.println("These are the matching characters : " + compareTwoStrings(myFirstString, myThirdString));

        System.out.println("Two HashSet: These are the matching characters : " + compareTwoStrings(myFirstString, mySecondString));
        System.out.println("Two HashSet: These are the matching characters : " + commonCharacters(myFirstString, myThirdString));

        System.out.println("One HashSet: These are the matching characters : " + findDuplicatesWithOneHashSet(myFirstString, mySecondString));
        System.out.println("One HashSet: These are the matching characters : " + findDuplicatesWithOneHashSet(myFirstString, myThirdString));
    }


}
