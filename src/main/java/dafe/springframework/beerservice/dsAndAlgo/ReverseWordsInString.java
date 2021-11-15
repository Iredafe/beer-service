package dafe.springframework.beerservice.dsAndAlgo;

public class ReverseWordsInString {

    public static String reverseWordsInString(String string){

        StringBuilder result = new StringBuilder();
        for(int index = string.length()-1; index>=0; index--){
            char character = string.charAt(index);
            result.append(character);
        }

        return result.toString();
    }


    public static void main(String[] args) {
        String input =  "AlgoExpert is the best!";

        System.out.println("This is the reversed string : " + reverseWordsInString(input));
    }
}
