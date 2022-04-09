package dafe.springframework.beerservice.OnsitePrep;

public class UniqueEmailAddresses {


    public static void main(String[] args) {
        String [] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};

        System.out.println("This is the number of unique address : " + uniqueEmailAddress(emails) );
    }
}
