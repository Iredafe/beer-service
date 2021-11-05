package dafe.springframework.beerservice.dsAndAlgo;

public class CeasarCypherEncryptor {
    //create a variable for new letter/string
    //create a new key in case the key is larger than 26, this will help slash the key
    //loop through each letter and convert it to unicode with char data type
    //after converting to unicode, add it to the new string variable
    //create a method to do the conversion/calculation logic

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


    public static String caesarCypherEncryptor2(String str, int key){
        int newKey = key%26;
        char[] newLetters = new char[str.length()];
        String alphabet ="abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<str.length(); i++){
            newLetters[i] = getNewLetter2(str.charAt(i), newKey, alphabet);
        }
        return new String(newLetters);
    }

    public static char getNewLetter2(char letter, int key, String alphabet){
        int newLetterCode = alphabet.indexOf(letter) + key;
        return alphabet.charAt(newLetterCode%26);
    }

    public static void main(String[] args) {
        String str="xyz";
        int key =2;
        System.out.println("This is the new string : " + caesarCypherEncryptor(str, key));
        System.out.println("This is the new string 2 : " + caesarCypherEncryptor2(str, key));
    }
}
