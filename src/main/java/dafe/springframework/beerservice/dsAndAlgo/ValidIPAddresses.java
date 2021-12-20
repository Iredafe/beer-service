package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class ValidIPAddresses {

    public static ArrayList<String> validIPAddresses(String input){

        return new ArrayList<>();
    }

    public boolean isValidPart(String input){
        int stringAsInt = Integer.parseInt(input);
        boolean hasLeadingZero = input.length()==Integer.toString(stringAsInt).length();
        if(stringAsInt > 255 || !hasLeadingZero) return false;
        return true;
    }

    public static String join(String [] strings){
        StringBuilder sb = new StringBuilder();
    for(int i= 0; i<strings.length; i++){
        sb.append(strings[i]);
        if(i< strings.length-1) sb.append(".");
    }
    return sb.toString();
    }

    public static void main(String[] args) {
        String input = "1921680";
        System.out.println("These are the valid IP addresses : " + validIPAddresses(input));
    }
}
