package dafe.springframework.beerservice.dsAndAlgo;


import java.util.ArrayList;

public class ValidIPAddress {

public static ArrayList<String> validIPAddress(String input){

    ArrayList<String> ipAddressFound = new ArrayList<>();
    for(int i = 1; i<Math.min(input.length(), 4); i++){
        String[] currentIpAddressParts = new String[]{"","","",""};

        currentIpAddressParts[0] = input.substring(0, i);

        if(!isValidPart(currentIpAddressParts[0])){
            continue;
        }
        for(int j = i+1; j<i + Math.min(input.length() -i, 4); j++){
            currentIpAddressParts[1] = input.substring(i,j);
            if(!isValidPart(currentIpAddressParts[1])){
                continue;
            }

            for(int k = j+1; k<j + Math.min(input.length() -j, 4); k++){
                currentIpAddressParts[2]=input.substring(j,k);
                currentIpAddressParts[3] = input.substring(k);

                if(isValidPart(currentIpAddressParts[2]) && isValidPart(currentIpAddressParts[3])){
                    ipAddressFound.add(join(currentIpAddressParts));
                }
            }
        }
    }

    return new ArrayList<>();
}



public static boolean isValidPart(String inputString){
    int stringAsInt = Integer.parseInt(inputString);
    if(stringAsInt > 255){
        return false;
    }
    return inputString.length() ==Integer.toString(stringAsInt).length(); //check for leading 0
}


public static String join(String [] inputArrayStrings){

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
