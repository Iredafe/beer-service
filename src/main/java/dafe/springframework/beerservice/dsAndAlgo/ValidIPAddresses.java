package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class ValidIPAddresses {

    public static ArrayList<String> validIPAddresses(String input){

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        String input = "1921680";
        System.out.println("These are the valid IP addresses : " + validIPAddresses(input));
    }
}
