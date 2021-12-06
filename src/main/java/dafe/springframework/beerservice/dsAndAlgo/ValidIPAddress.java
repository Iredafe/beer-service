package dafe.springframework.beerservice.dsAndAlgo;


import java.util.ArrayList;

public class ValidIPAddress {

public static ArrayList<String> validIPAddress(String input){


    return new ArrayList<>();
}



public static boolean isValidPart(String inputString){
    int stringAsInt = Integer.parseInt(inputString);
    if(stringAsInt > 255){
        return false;
    }
    return inputString.length() ==Integer.toString(stringAsInt).length(); //check for leading 0
}


public String join(String [] inputArrayStrings){

    StringBuilder sb = new StringBuilder();
    for(int l=0; l<inputArrayStrings.length; l++){
        sb.append(inputArrayStrings[l]);
        if(l< inputArrayStrings.length){
            sb.append(".");
        }
    }
    return sb.toString();
}


    public static void main(String[] args) {

    String input = "1921680";
        System.out.println("These are the valid IP addresses : " + validIPAddress(input));
    }
}
