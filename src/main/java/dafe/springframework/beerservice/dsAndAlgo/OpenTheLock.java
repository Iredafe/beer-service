package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OpenTheLock {

    public static int openTheLock(String [] deadends, String target){
    int numberOfTurns = 0;
        Set<String> deadendSet = new HashSet<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");

        for(int i=0; i<deadends.length; i++){
            deadendSet.add(deadends[i]);
        }

    while(!queue.isEmpty()){
        while(queue.size() > 0){
            String current = queue.poll();

            if(deadendSet.contains(current) || visited.contains(current)) continue;
            if(current == target) return numberOfTurns;
        }
    }
        return -1;
    }

    public static void main(String[] args) {
        String [] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";

        System.out.println("This is the depth : " + openTheLock(deadends, target));
    }
}
