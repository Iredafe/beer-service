package dafe.springframework.beerservice.OnsitePrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class CourseSchedule1 {


    private static boolean canFinish(int numCourses, int [][] prerequisites){

        HashMap<Integer, List<Integer>> dictionary = new HashMap<>();
        for(int [] relations : prerequisites){
            if(dictionary.containsKey(relations[0])){
                dictionary.get(relations[1]).add(relations[0]);
            }else{
                List<Integer> nextCourses = new ArrayList<>();
                nextCourses.add(relations[0]);
                dictionary.put(relations[1], nextCourses);
            }
        }

        boolean [] path = new boolean[numCourses];
        boolean [] checked = new boolean[numCourses];

        for(int currentCourse = 0; currentCourse<numCourses; currentCourse++){
            if(isCyclic(dictionary, currentCourse, checked, path)){
                return false;
            }
        }
        return true;
     }

     private static boolean isCyclic(HashMap<Integer, List<Integer>> dictionary,
                                     int currentCourse, boolean[] path, boolean[] checked){

        if(checked[currentCourse]) return false;
        if(path[currentCourse]) return true;

        boolean cyclicCheck = false;

        for(Integer child : dictionary.get(currentCourse)){
            cyclicCheck = isCyclic(dictionary, child, path, checked);
        }

        path[currentCourse] = false;
        checked[currentCourse] = true;

        return cyclicCheck;
     }

    public static void main(String[] args) {
        int numCourses = 4; int [][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};

        System.out.println("Can these courses be finished ? " + canFinish(numCourses, prerequisites) );
    }
}
