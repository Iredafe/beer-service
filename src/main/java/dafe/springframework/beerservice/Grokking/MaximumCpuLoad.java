package dafe.springframework.beerservice.Grokking;

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
