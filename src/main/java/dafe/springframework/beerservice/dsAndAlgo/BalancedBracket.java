package dafe.springframework.beerservice.dsAndAlgo;

public class BalancedBracket {

    public static boolean balancedBracket(String input) {

        return true;
    }


    public static void main(String[] args) {

        String input = "([])(){}(())()()";
        System.out.println("This input is a balanced bracket : " + balancedBracket(input));
    }
}