package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;
import java.util.List;

public class DestinationCity {

    private static String findDestination(List<List<String>> paths){

        return "";
    }

    public static void main(String[] args) {
        List<List<String>> paths = Arrays.asList(Arrays.asList("London","New York"),Arrays.asList("New York","Lima"),
                Arrays.asList("Lima","Sao Paulo"));
        List<List<String>> paths1 = Arrays.asList(Arrays.asList("B", "C"), Arrays.asList("D", "B"), Arrays.asList("C","A"));

        System.out.println("The final destination is : " + findDestination(paths));
        System.out.println("The final destination 1 is : " + findDestination(paths1));
    }
}
