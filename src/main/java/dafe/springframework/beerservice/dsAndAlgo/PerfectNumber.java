package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class PerfectNumber {

    public static int perfectNumber(int n){
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        int count = 0;

        while(!queue.isEmpty()){

        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("This is the least perfect number required : " + perfectNumber(13));
    }
}
