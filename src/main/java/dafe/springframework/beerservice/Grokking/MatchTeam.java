package dafe.springframework.beerservice.Grokking;

import java.util.*;

public class MatchTeam {

    private static List<String[]> getMatchResult(String [][] users){
        HashMap<String, Queue<String>> map = new HashMap<>();
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        String[][] users =  {{"Alex","Infra"},{"Kevin","Search"},{"Jill","HR"},{"Jane","Infra"},{"Justin","Search"},{"Michael","HR"}};
        List<String[]> lst = getMatchResult(users);
        for(String[] res : lst)
            System.out.println(Arrays.toString(res));
    }
}
