package dafe.springframework.beerservice.OnsitePrep;

public class CourseSchedule2 {



    public static void main(String[] args) {

        int numCourses = 4; int [][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
        int numCourses1 = 2; int [][] prerequisites1 = {{1,0},{0,1}};

        System.out.println("Can these courses be finished ? " + findOrder(numCourses, prerequisites));
        System.out.println("Can these courses be finished ? " + findOrder(numCourses1, prerequisites1));
    }
}
