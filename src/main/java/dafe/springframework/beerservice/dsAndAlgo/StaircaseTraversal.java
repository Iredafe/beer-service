package dafe.springframework.beerservice.dsAndAlgo;

public class StaircaseTraversal {

    private static int staircaseTraversal(int height, int maxSteps) {
        return staircaseTraversalHelper(height, maxSteps);
    }

    private static  int staircaseTraversalHelper(int height, int maxSteps){
        int numberOfWays = 0;
        if(height <= 1) return 1;

        for(int step=1; step < Math.min(height, maxSteps)+1; step++){
            numberOfWays += staircaseTraversalHelper(height-step, maxSteps);
        }
        return numberOfWays;
    }
    public static void main(String[] args) {
        int height = 4;
        int maxSteps = 2;
        System.out.println("This is the maximum number of steps : " + staircaseTraversal(height, maxSteps));
    }
}
