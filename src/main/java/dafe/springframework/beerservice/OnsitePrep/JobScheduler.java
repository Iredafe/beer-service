package dafe.springframework.beerservice.OnsitePrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JobScheduler {

    private static List<Integer> findOrder(List<Integer> jobs, List<Integer[]> dependencies){

        List<Integer[]>graph = new ArrayList<>();

        for(int i=0; i< jobs.size(); i++){
            graph.add(new Integer[]{});
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<Integer> jobs = Arrays.asList(1,2,3,4);
        List<Integer[]> dependencies = Arrays.asList(new Integer[]{1, 2},
                new Integer[]{1, 3},
                new Integer[]{3, 2},
                new Integer[]{4, 2},
                new Integer[]{4, 3});
    }
}
