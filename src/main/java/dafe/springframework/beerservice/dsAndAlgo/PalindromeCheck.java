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

    public static void main(String[] args) {
        String input = "abcdcba";
        System.out.println("This String is a palindrome : " + isPalindrome(input));
    }
}
