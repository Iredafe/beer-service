package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class PerfectNumber {

    public static int perfectNumber(int n){
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(0);
        visited.add(0);
        int count = 1;

        while(!queue.isEmpty()){
            int size = queue.size();
            while(size > 0){

            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("This is the least perfect number required : " + perfectNumber(13));
    }
}
