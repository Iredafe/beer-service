package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchTeam {

    private static List<String[]> getMatchResult(String [][] users){

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        String[][] users =  {{"Alex","Infra"},{"Kevin","Search"},{"Jill","HR"},{"Jane","Infra"},{"Justin","Search"},{"Michael","HR"}};
        List<String[]> lst = getMatchResult(users);
        for(String[] res : lst)
            System.out.println(Arrays.toString(res));
    }
}
