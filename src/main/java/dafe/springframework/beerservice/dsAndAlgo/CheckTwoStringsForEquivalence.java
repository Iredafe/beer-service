package dafe.springframework.beerservice.dsAndAlgo;

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

    public static boolean arrayStringAreEqual1(String [] word1, String [] word2){

        boolean stringsAreEqual = false;
        String myFirstString ="";
        String mySecondString ="";
        for(int i=0; i<word1.length; i++){
            myFirstString.concat(word1[i]);
        }

        for(int i=0; i< word2.length; i++){
            mySecondString.concat(word2[i]);
        }

        if(myFirstString.equals(mySecondString)){
            stringsAreEqual=true;
        }
        return stringsAreEqual;
    }

    public static void main(String[] args) {

        String [] word1 = new String[]{"ab", "c"};
        String [] word2 = new String[] {"a", "bc"};
        System.out.println("The two strings are equal (StringBuilder append method) : " + arrayStringAreEqual(word1, word2));
        System.out.println("The two strings are equal (String concat method) : " + arrayStringAreEqual1(word1, word2));
    }
}
