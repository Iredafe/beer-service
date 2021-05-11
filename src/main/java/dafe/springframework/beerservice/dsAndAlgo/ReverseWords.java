package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

 public class ReverseWords {
        public static String reverseWords(String statement){
        //split string of statement and save into an array
        String [] newStatement = statement.split(" ");
        //initialize two pointers i and j
        int j= newStatement.length-1;
        int i=0;
        //iterate over the array
        while ( i<=j){
        //call the swap method
            swap(newStatement, i, j);
            i++;
            j--;
        }

        return Arrays.toString(newStatement);
    }

//create a custom reverse/swap method
        private static void swap(String [] myString, int position1, int position2){
            String temp = myString[position1];
            myString[position1] = myString[position2];
            myString[position2]=temp;
        }

        public static String reverseSentence(String sentence){
            String [] str = sentence.split(" ");
            String ans ="";

            for(int i= str.length-1; i>=0; i--){
                ans+=str[i] + " ";
            }

            return ans;
        }


    public  static void main(String [] args){
        System.out.println(" Reverse words : " +reverseWords("I love you"));
        System.out.println(" Reverse words : " +reverseWords("Hello world I love to code"));

        System.out.println(" Reverse sentence : " + reverseSentence("I love you"));
        System.out.println(" Reverse sentence : " +reverseSentence("Hello world, I love to code"));
    }


}