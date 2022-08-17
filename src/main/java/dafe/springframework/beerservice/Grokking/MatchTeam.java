package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;
import java.util.List;

public class MatchTeam {

    public static void main(String[] args) {
        String[][] users =  {{"Alex","Infra"},{"Kevin","Search"},{"Jill","HR"},{"Jane","Infra"},{"Justin","Search"},{"Michael","HR"}};
        List<String[]> lst = getMatchResult(users);
        for(String[] res : lst)
            System.out.println(Arrays.toString(res));
    }
}
