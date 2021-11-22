package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

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

    public static String longestPalindrome(String input){

        int [] currentLongest = new int[]{0,1};
        for(int i=0; i<input.length(); i++){
            int [] even = getPalindrome(input, i-1, i);
            int [] odd = getPalindrome(input, i-1, i+1);
            System.out.println("odd : " +Arrays.toString(odd));
            System.out.println("even : " +Arrays.toString(even));
        int [] longest = odd[1] - odd[0] > even[1]- even[0] ? odd : even;
            System.out.println("longest : " + Arrays.toString(longest));
        currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
            System.out.println(" current longest : " + Arrays.toString(currentLongest));
        }
        System.out.println(" current longest 2 : " + Arrays.toString(currentLongest));

        return input.substring(currentLongest[0], currentLongest[1]);
    }

    public static int[] getPalindrome(String input, int left, int right){
        while(left >=0 && right < input.length()){
            if(input.charAt(left) != input.charAt(right)){
                break;
            }
            left--;
            right++;
        }

        return new int[] {left+1, right};
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

        System.out.println("This is the longest palindromic substring : " + longestPalindrome(input));
        System.out.println("This is the longest palindromic substring : " + longestPalindromicSubstring(input));
    }
}
