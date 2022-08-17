package dafe.springframework.beerservice.Grokking;

import java.util.*;

public class MatchTeam {

    private static List<String[]> getMatchResult(String [][] users){
        HashMap<String, Queue<String>> map = new HashMap<>();

        for(String [] user : users){
            map.putIfAbsent(user[1], new LinkedList<>());
            map.get(user[1]).offer(user[0]);
        }

        PriorityQueue<Map.Entry<String, Queue<String>>> heap= new PriorityQueue<>((a,b)
        ->b.getValue().size()-a.getValue().size());
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        String[][] users =  {{"Alex","Infra"},{"Kevin","Search"},{"Jill","HR"},{"Jane","Infra"},{"Justin","Search"},{"Michael","HR"}};
        List<String[]> lst = getMatchResult(users);
        for(String[] res : lst)
            System.out.println(Arrays.toString(res));
    }
}
