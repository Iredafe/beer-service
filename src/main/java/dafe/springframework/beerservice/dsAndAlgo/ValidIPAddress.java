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
    return true;
}


public String join(String [] inputArrayStrings){

    return "";
}
}
