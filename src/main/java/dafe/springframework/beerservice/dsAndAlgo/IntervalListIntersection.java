package dafe.springframework.beerservice.dsAndAlgo;

public class IntervalListIntersection {

    public static void main(String[] args) {
        int[][] first = {{0,2},{5,10},{13,23},{24,25}};
        int[][] second = {{1,5},{8,12},{15,24},{25,26}};

        System.out.println("This is the intersection : " + findIntersection(first, second));
    }
}
