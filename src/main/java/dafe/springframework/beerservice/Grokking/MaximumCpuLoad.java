package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumCpuLoad {

    static class Job{
        int start;
        int end;
        int load;

        public Job(int start, int end, int load){
            this.start=start;
            this.end=end;
            this.load=load;
        }
    }

    private static int findMaxCPULoad(List<Job> listOfJobs){

        int maximumLoad=0;
        Collections.sort(listOfJobs, (a,b)-> Integer.compare(a.start, b.start));
        return 0;
    }
    public static void main(String[] args) {
        List<Job> input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 3),
                new Job(2, 5, 4), new Job(7, 9, 6)));
        System.out.println("Maximum CPU load at any time: " +
                findMaxCPULoad(input));

        input = new ArrayList<Job>(Arrays.asList(new Job(6, 7, 10), new Job(2, 4, 11),
                new Job(8, 12, 15)));
        System.out.println("Maximum CPU load at any time: " +
                findMaxCPULoad(input));

        input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 2), new Job(2, 4, 1),
                new Job(3, 6, 5)));
        System.out.println("Maximum CPU load at any time: " +
                findMaxCPULoad(input));
    }
}
