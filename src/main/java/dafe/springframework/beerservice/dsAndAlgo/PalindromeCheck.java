package dafe.springframework.beerservice.dsAndAlgo;

public class PalindromeCheck {

    public static boolean isPalindrome(String str){ //O(n^2) time
        String reverse ="";
        char[] characters = str.toCharArray();
        for(int i=characters.length-1; i>=0; i--){
            reverse+=characters[i];
        }
        return reverse.equals(str);
    }

    public static boolean isItPalindrome(String str){ //O(n) time
        StringBuilder newString = new StringBuilder();

        char[] characters = str.toCharArray();
        for(int i = characters.length-1; i>=0; i--){
            newString.append(characters[i]);
        }
        return str.equals(newString.toString());
    }

    public static boolean isPalindromeUsingPointers(String str){ //O(n) time
        int left = 0, right= str.length()-1;
        while(left<right && left!=right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String str){
      return isPalindromeRecursive(str, 0);

    }

    public static boolean isPalindromeRecursive(String str, int i){
        int j=str.length()-1 -i;
        return i >= j? true: str.charAt(i)==str.charAt(j) && isPalindromeRecursive(str,i+1);
    }

    public static void main(String[] args) {
        String input = "abcdcb";
        System.out.println("This String is a palindrome : " + isPalindromeUsingPointers(input));
    }
}
