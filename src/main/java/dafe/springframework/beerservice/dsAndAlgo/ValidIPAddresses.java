package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class ValidIPAddresses {

    public static ArrayList<String> validIPAddresses(String input){
        ArrayList<String> ipAddressesFound = new ArrayList<>();

        for(int i = 1; i< Math.min(input.length(), 4); i++){
            String [] currentIPAddressParts = new String[]{"","","",""};

            currentIPAddressParts[0] = input.substring(0,i);
            if(!isValidPart(currentIPAddressParts[0])) continue;

            for(int j=i+1; j< i+Math.min(input.length()-i, 4); j++){
                currentIPAddressParts[1] = input.substring(i,j);
                if(!isValidPart(currentIPAddressParts[1])) continue;

                for(int k=j+1; k< j+ Math.min(input.length()-j, 4); k++){
                    currentIPAddressParts[2] = input.substring(j, k);
                    currentIPAddressParts[3] = input.substring(k);
                    if(isValidPart(currentIPAddressParts[2]) && isValidPart(currentIPAddressParts[3])){
                        ipAddressesFound.add(join(currentIPAddressParts));
                    }
                }
            }
        }

        return ipAddressesFound;
    }

    public static boolean isValidPart(String input){
        int stringAsInt = Integer.parseInt(input);
        if(stringAsInt > 255) return false;
        return input.length()==Integer.toString(stringAsInt).length();
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
