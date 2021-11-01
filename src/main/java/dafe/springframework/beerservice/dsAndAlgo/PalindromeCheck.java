package dafe.springframework.beerservice.dsAndAlgo;

public class PalindromeCheck {

    public static boolean isPalindrome(String str){
        String reverse ="";
        char[] characters = str.toCharArray();
        for(int i=characters.length-1; i>=0; i--){
            reverse+=characters[i];
        }
        return reverse.equals(str);
    }

    public static boolean isItPalindrome(String str){
        StringBuilder newString = new StringBuilder();

        char[] characters = str.toCharArray();
        for(int i = characters.length-1; i>=0; i--){
            newString.append(characters[i]);
        }
        return str.equals(newString.toString());
    }

    public static boolean isPalindromeUsingPointers(String str){
        int left = 0, right= str.length()-1;
        for(int i=0; i<str.length(); i++){
            while (left<right){

            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "abcdcba";
        System.out.println("This String is a palindrome : " + isItPalindrome(input));
    }
}
