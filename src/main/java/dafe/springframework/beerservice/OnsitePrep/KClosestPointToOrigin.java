package dafe.springframework.beerservice.OnsitePrep;

public class KClosestPointToOrigin {

    public static void main(String[] args) {
        int [] [] points = {{3,3},{5,-1},{-2,4}}; int k = 1;

        System.out.println("This is the kth closest point to origin (0, 0) : " + kthClosestPoint(points, k));
    }
}
