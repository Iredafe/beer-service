package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OpenTheLock {

    public static int openTheLock(String [] deadends, String target){
    int numberOfTurns = 0;
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        Set<String> deadendSet = new HashSet<>();

        for(int i=0; i<deadends.length; i++){
            deadendSet.add(deadends[i]);
        }


    while(!queue.isEmpty()){

    }
        return -1;
    }

    public static void main(String[] args) {
        String [] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";

        System.out.println("This is the depth : " + openTheLock(deadends, target));
    }
}
