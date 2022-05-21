package dafe.springframework.beerservice.OnsitePrep;

import java.util.*;

public class JobScheduler {

    private static List<Integer> findOrder(List<Integer> jobs, List<Integer[]> dependencies){

        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        for(Integer [] dependency : dependencies){
            if(graph.containsKey(dependency[0])){
                graph.get(dependency[0]).add(dependency[1]);
            }else{
                List<Integer> nextJobs = new ArrayList<>();
                graph.put()
            }
        }

        boolean [] visited = new boolean[size];
        boolean [] checked = new boolean[size];

        for(int currentJob = 0; currentJob< size; currentJob++){
            if(isCycle(graph, currentJob, checked, visited, stack)){
                return new ArrayList<>();
            }
        }

        for(int i=0; i<size; i++){
            result.add(stack.pop());
        }

        return result;
    }

    private static boolean isCycle(List<List<Integer>> graph, int currentJob, boolean [] checked, boolean [] visited,
                                   Stack<Integer> stack){

        if(checked[currentJob]) return false;
        if(visited[currentJob]) return true;

        visited[currentJob] = true;

        for(Integer neighbor : graph.get(currentJob)){
            if(isCycle(graph, neighbor, checked, visited, stack)){
                return true;
            }
        }
        checked[currentJob] = true;
        visited[currentJob] = false;

        stack.push(currentJob);

        return false;
    }

    public static void main(String[] args) {
        List<Integer> jobs = Arrays.asList(1,2,3,4);
        List<Integer[]> dependencies = Arrays.asList(new Integer[]{1, 2},
                new Integer[]{1, 3},
                new Integer[]{3, 2},
                new Integer[]{4, 2},
                new Integer[]{4, 3});

        System.out.println("This is the order in which the jobs must be done : " + findOrder(jobs, dependencies));
    }
}
