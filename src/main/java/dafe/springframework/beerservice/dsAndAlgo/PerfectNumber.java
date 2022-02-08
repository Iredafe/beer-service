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
            for(int i=0; i<size; i++){
                int top = queue.poll();
                for(int j=0; j*j<=n; j++){
                    int current = top + j*j;

                    if(current== n) return count;
                    else if(current > n) break;
                    else{
                        if(!visited.contains(current)){
                            queue.offer(current);
                            visited.add(current);
                        }
                    }
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("This is the least perfect number required : " + perfectNumber(1));
    }
}
