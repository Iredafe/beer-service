package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class CourseSchedule1 {


    private static boolean canFinish(int numCourses, int [][] prerequisites){

        HashMap<Integer, List<Integer>> dictionary = new HashMap<>();
        for(int [] relations : prerequisites){
            if(dictionary.containsKey(relations[1])){
                dictionary.get(relations[1]).add(relations[0]);
            }else{
                List<Integer> nextCourses = new LinkedList<>();
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
                                     Integer currentCourse, boolean[] path, boolean[] checked){

        if(checked[currentCourse]) return false;
        if(path[currentCourse]) return true;
        if(!dictionary.containsKey(currentCourse)) return false;

        boolean cyclicCheck = false;
        path[currentCourse] =true;

        for(Integer child : dictionary.get(currentCourse)){
            cyclicCheck = isCyclic(dictionary, child, path, checked);
            if(cyclicCheck) break;
        }

        path[currentCourse] = false;
        checked[currentCourse] = true;

        return cyclicCheck;
     }

    public static void main(String[] args) {
        int numCourses = 4; int [][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
        int numCourses1 = 2; int [][] prerequisites1 = {{1,0},{0,1}};

        System.out.println("Can these courses be finished ? " + canFinish(numCourses, prerequisites));
        System.out.println("Can these courses be finished ? " + canFinish(numCourses1, prerequisites1));
    }
}
