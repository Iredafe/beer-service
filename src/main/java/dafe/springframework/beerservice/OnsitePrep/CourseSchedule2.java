package dafe.springframework.beerservice.OnsitePrep;

import java.util.*;

public class CourseSchedule2 {

    private static int[] findOrder(int numCourses, int[][] prerequisites){
        int [] result = new int[numCourses];
        List<List<Integer>> graph = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int [] coursesRelationship : prerequisites){
            graph.get(coursesRelationship[1]).add(coursesRelationship[0]);
        }
        boolean [] visited = new boolean[numCourses];
        boolean [] checked = new boolean[numCourses];

        for(int currentCourse = 0; currentCourse < numCourses; currentCourse++){
            if(isCyclic(graph, stack, currentCourse, visited, checked)){
                return new int[] {};
            }
            while (!stack.isEmpty()){
                result[currentCourse++] = stack.pop();
            }
        }

        return result;
    }

    private static boolean isCyclic(List<List<Integer>> graph, Stack<Integer> stack, Integer currentCourse,
                                    boolean [] visited, boolean [] checked){

        if(checked[currentCourse]) return false;
        if(visited[currentCourse]) return true;

        visited[currentCourse] = true;

        //dfs
        for (Integer child : graph.get(currentCourse)){
            if(isCyclic(graph, stack, child, visited, checked)) return true;
        }
        stack.push(currentCourse);
        visited[currentCourse]=false;
        checked[currentCourse] =true;

        return false;
    }
    public static void main(String[] args) {

        int numCourses = 4; int [][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
        int numCourses1 = 2; int [][] prerequisites1 = {{1,0},{0,1}};

        System.out.println("Can these courses be finished ? " + Arrays.toString(findOrder(numCourses, prerequisites)));
    }
}
