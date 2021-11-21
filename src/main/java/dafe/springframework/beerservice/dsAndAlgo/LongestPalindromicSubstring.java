package dafe.springframework.beerservice.dsAndAlgo;

public class LongestPalindromicSubstring {

    public static String longestPalindromicSubstring(String input ){
    String longest = "";
    for(int i=0; i < input.length(); i++){
        for(int j=i; j<input.length(); j++){
            String substring = input.substring(i, j+1);
            if(substring.length() > longest.length() && isPalindrome(substring)){
                longest = substring;
            }
        }
    }
        return longest;
    }

    public static boolean isPalindrome(String input){
        int left = 0; int right = input.length()-1;
        while(left < right){
            if(input.charAt(left) != input.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "abaxyzzyxf";

        System.out.println("This is the longest palindromic substring : " + longestPalindromicSubstring(input));
    }
}
