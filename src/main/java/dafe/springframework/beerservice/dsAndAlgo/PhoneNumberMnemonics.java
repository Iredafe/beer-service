package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumberMnemonics {
    static Map<Character, String[]> DIGIT_LETTERS = new HashMap<>();
    static {
        DIGIT_LETTERS.put('0', new String[]{"0"});
        DIGIT_LETTERS.put('1', new String[]{"1"});
        DIGIT_LETTERS.put('2', new String[]{"a", "b", "c"});
        DIGIT_LETTERS.put('3', new String[]{"d", "e", "f"});
        DIGIT_LETTERS.put('4', new String[]{"g", "h", "i"});
        DIGIT_LETTERS.put('5', new String[]{"j", "k", "l"});
        DIGIT_LETTERS.put('6', new String[]{"m", "n", "o"});
        DIGIT_LETTERS.put('7', new String[]{"p", "q", "r", "s"});
        DIGIT_LETTERS.put('8', new String[]{"t", "u", "v"});
        DIGIT_LETTERS.put('9', new String[]{"w", "x", "y", "z"});
    }

    public static ArrayList<String> phoneNumberMnemonics (String phoneNumber){

        String [] currentLetters = new String[phoneNumber.length()];
        Arrays.fill(currentLetters, "0");
        ArrayList<String> result = new ArrayList<>();
        phoneNumberMnemonicsHelper(0, currentLetters, result, phoneNumber);
        return result;
    }

    public static void phoneNumberMnemonicsHelper
            (int index, String[] currentLetters, ArrayList<String> result, String phoneNumber){
        if(index == phoneNumber.length()){
            System.out.println("Current letters before join : " + Arrays.toString(currentLetters));
            String mnemonic = String.join("", currentLetters);
            System.out.println("Mnemonic after join : " + mnemonic);
            result.add(mnemonic);
        }else{
            char digit = phoneNumber.charAt(index);
            String [] letters = DIGIT_LETTERS.get(digit);
            for(String letter : letters){
                currentLetters[index] = letter;
                phoneNumberMnemonicsHelper(index+1, currentLetters, result, phoneNumber);
            }
        }
    }

    public static ArrayList<String> letterCombination(String phoneNumber){
        final String[] mapping= new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs", "tuv", "wxyz"};
        ArrayList<String> result = new ArrayList<>();
        char [] currentCombination = new char[phoneNumber.length()];
        helper(0, currentCombination, result, phoneNumber);
        return result;
    }

    public static void helper(int index, char [] currentCombination, ArrayList<String> result, String phoneNumber){

    }
    public static void main(String[] args) {

        String phoneNumber = "1905";

        System.out.println("These are the mnemonics : " + phoneNumberMnemonics(phoneNumber));
    }
}
