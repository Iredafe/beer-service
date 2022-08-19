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
        heap.addAll(map.entrySet());
        List<String[]> result = new ArrayList<>();
        while (heap.size() > 1){
            Map.Entry<String,Queue<String>> entry1 = heap.poll();
            Map.Entry<String,Queue<String>> entry2 = heap.poll();

            result.add(new String[]{entry1.getValue().poll(), entry2.getValue().poll()});
            if(entry1.getValue().size() > 0){
                heap.add(entry1);
            }
            if(entry2.getValue().size() > 0){
                heap.add(entry2);
            }
        }

         return result;
    }

    public static void main(String[] args) {
        String[][] users =  {{"Alex","Infra"},{"Kevin","Search"},{"Jill","HR"},{"Jane","Infra"},{"Justin","Search"},{"Michael","HR"}};
        String[][] users_ =  {{"Alex","Infra"},{"Kevin","Search"},{"Jill","HR"},{"Jane","Infra"},{"Justin","Search"},{"Michael","HR"}};
        String[][] users1 =  {{"Alex","Infra"},{"Kevin","Search"},{"Jill","HR"},{"Jane","Infra"},{"Justin","Search"},{"Michael","HR"}};
        List<String[]> lst = getMatchResult(users);
        for(String[] res : lst)
            System.out.println(Arrays.toString(res));
    }
}
