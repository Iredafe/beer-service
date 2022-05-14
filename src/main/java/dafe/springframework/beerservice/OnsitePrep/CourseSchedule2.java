package dafe.springframework.beerservice.OnsitePrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class CourseSchedule2 {

    private static int[] findOrder(int numCourses, int[][] prerequisites){
        int [] result = new int[numCourses];
        HashMap<Integer, List<Integer>> dictionary = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int [] coursesRelationship : prerequisites){
            if(dictionary.containsKey(coursesRelationship[1])){
                dictionary.get(coursesRelationship[1]).add(coursesRelationship[0]);
            }else{
                List<Integer> nextCourse = new ArrayList<>();
                nextCourse.add(coursesRelationship[0]);
                dictionary.put(coursesRelationship[1], nextCourse);
            }
        }

        boolean [] visited = new boolean[numCourses];
        boolean [] checked = new boolean[numCourses];

        for(int currentCourse = 0; currentCourse < numCourses; currentCourse++){
            if(isCyclic(dictionary, stack, currentCourse, visited, checked)){

            }
        }

        return result;
    }

    public static void main(String[] args) {

        int numCourses = 4; int [][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
        int numCourses1 = 2; int [][] prerequisites1 = {{1,0},{0,1}};

        System.out.println("Can these courses be finished ? " + findOrder(numCourses, prerequisites));
        System.out.println("Can these courses be finished ? " + findOrder(numCourses1, prerequisites1));
    }
}
