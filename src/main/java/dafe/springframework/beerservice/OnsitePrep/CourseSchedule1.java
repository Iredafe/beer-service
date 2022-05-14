package dafe.springframework.beerservice.OnsitePrep;

public class CourseSchedule1 {


    private static boolean canFinish(int numCourses, int [][] prerequisites){

    }

    public static void main(String[] args) {
        int numCourses = 4; int [][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};

        System.out.println("Can these courses be finished ? " + canFinish(numCourses, prerequisites) );
    }
}
