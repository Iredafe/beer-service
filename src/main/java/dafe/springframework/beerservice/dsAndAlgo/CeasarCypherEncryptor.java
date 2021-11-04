package dafe.springframework.beerservice.dsAndAlgo;

public class CeasarCypherEncryptor {
    public static String caesarCypherEncryptor(String str, int key){
        char[] newLetters = new char[str.length()];
        int newKey = key%26;
        for(int i=0; i< str.length(); i++){
             newLetters[i] = getNewLetter(str.charAt(i), newKey);
        }
        return new String(newLetters);
    }

    private static char getNewLetter(char letter, int key) {
        int newLetterCode = letter + key;
        System.out.println("new letter code : " + newLetterCode);
        return newLetterCode<=122? (char)newLetterCode: (char)(96+ newLetterCode%122);
    }


    public static void main(String[] args) {
        String str="xyz";
        int key =2;
        System.out.println("This is the new string : " + caesarCypherEncryptor(str, key));
    }
}
