package dafe.springframework.beerservice;

public class CheckTwoStringsForEquivalence {

    public static boolean arrayStringAreEqual(String [] word1, String [] word2){

        StringBuilder myFirstWord = new StringBuilder();
        for(String word:word1){
            myFirstWord.append(word);
        }

        StringBuilder mySecondWord = new StringBuilder();
        for(int i=0; i<word2.length; i++){
            mySecondWord.append(word2[i]);
        }
        return myFirstWord.toString().equals(mySecondWord.toString());
    }

    public static void main(String[] args) {

        String [] word1 = new String[]{"ab", "c"};
        String [] word2 = new String[] {"a", "bc"};
        System.out.println("The two strings are equal : " + arrayStringAreEqual(word1, word2));
    }
}
