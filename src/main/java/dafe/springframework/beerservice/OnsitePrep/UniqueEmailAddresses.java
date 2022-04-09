package dafe.springframework.beerservice.OnsitePrep;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {


    private static int uniqueEmailAddress(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        StringBuilder cleanEmail = new StringBuilder();

        for(String email : emails){
            for (int i=0; i< email.length(); i++){
                char currentCharacter = email.charAt(i);
                if(currentCharacter == '@' || currentCharacter == '+') break;
            }
        }


        return 0;
    }
    public static void main(String[] args) {
        String [] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};

        System.out.println("This is the number of unique address : " + uniqueEmailAddress(emails) );
    }

}
