package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfNumbers {

    //recursive solution
    public List<String> letterCombinations(String digits){

        List<String> result = new ArrayList<>();

        if(digits==null|| digits.length()==0){
            return  result;
        }
        String[] mapping ={
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        letterCombinationsRecursive(result, digits,"", 0,mapping);
        return result;
    }
    public void letterCombinationsRecursive(List<String> result, String digits, String current, int index, String[] mapping){

    }

}
