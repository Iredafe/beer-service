package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.List;

public class ValidSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence){
        int i=0;
        for (int value: array){
       if(i== sequence.size()){
           break;
       }
       if(sequence.contains(value)){
           i++;
       }
    }
        return i==sequence.size();
    }


    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5,1,22,25,6,-1,8,10);
        List<Integer> sequence =Arrays.asList(1,6,-1,10);

        System.out.println("This is a subsequence : " + isValidSubsequence(array,sequence) );


    }
}
