package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

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

    public static int staircaseTraversalMemoization(int height, int maxSteps){
        HashMap<Integer, Integer> memoize = new HashMap<>();
        memoize.put(0,1);
        memoize.put(1,1);
        return memoizeHelper(height, maxSteps, memoize);
    }

    public static int memoizeHelper(int height, int maxSteps, HashMap<Integer, Integer> memoize){
        if(memoize.containsKey(height)) return memoize.get(height);
        int numberOfWays = 0;
        for(int step=1; step< Math.min(height, maxSteps)+1; step++){
            numberOfWays += memoizeHelper(height-step, maxSteps, memoize);
        }
        memoize.put(height, numberOfWays);
        return numberOfWays;
    }

    public static void main(String[] args) {
        int height = 4;
        int maxSteps = 2;
        System.out.println("This is the maximum number of steps : " + staircaseTraversal(height, maxSteps));
        System.out.println("This is the maximum number of steps : " + staircaseTraversalMemoization(height, maxSteps));
    }
}
