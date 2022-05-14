package dafe.springframework.beerservice.OnsitePrep;

import java.util.HashMap;
import java.util.List;

public class CourseSchedule1 {


    private static boolean canFinish(int numCourses, int [][] prerequisites){

        HashMap<Integer, List<Integer>> dictionary = new HashMap<>();
     }

    public static void main(String[] args) {
        int numCourses = 4; int [][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};

        System.out.println("Can these courses be finished ? " + canFinish(numCourses, prerequisites) );
    }
}
