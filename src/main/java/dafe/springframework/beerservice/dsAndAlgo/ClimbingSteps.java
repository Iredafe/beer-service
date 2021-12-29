package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.HashMap;

public class ClimbingSteps {

    public static int climbingSteps(int stepNumber) {
        if (stepNumber >= 0 && stepNumber <= 2) return stepNumber;

        int previousStep1 = 0;
        int previousStep2 = 1;
        int previousStep3 = 2;
        for (int i = 4; i <= stepNumber; i++) {
            int result = previousStep1 + previousStep2 + previousStep3;
            previousStep1 = previousStep2;
            previousStep2 = previousStep3;
            previousStep3 = result;
        }
        return previousStep1 + previousStep2 + previousStep3;
    }

    public static int countWays(int number) {
        int[] memo = new int[number + 1];
        Arrays.fill(memo, -1);
        return countWays(number, memo);
    }

    static int countWays(int number, int[] memo) {
        if (number < 0) return 0;
        else if (number == 0) return 1;
        else if (memo[number] > -1) return memo[number];
        else memo[number] = countWays(number - 1, memo) + countWays(number - 2, memo) + countWays(number - 3, memo);
        return memo[number];
    }

    public static int countWaysHashMap(int n){
        HashMap<Integer, Integer> memoize = new HashMap<>();

        return countWaysHashMap(n, memoize);
    }

    public static int countWaysHashMap(int n, HashMap<Integer, Integer> memoize){
        memoize.put(1, 1);
        memoize.put(2, 2);
        memoize.put(3, 3);

        if(!memoize.containsKey(n)){
            int cache = countWaysHashMap(n - 1, memoize) + countWaysHashMap(n - 2, memoize) + countWaysHashMap(n - 3, memoize);
            memoize.put(n, cache);
        }
        return memoize.get(n);
    }

public static int memoization(int number){
    if(number>=0 && number <=2) return number;
int cache[] = new int [number];
cache[1]=1;
cache[2]=2;
cache[3]=3;
for (int i=4; i<number; i++){
    cache[i] = cache[i-1]+cache[i-2]+cache[i-3];
}
return cache[number-1]+cache[number-2]+ cache[number-3];
}

public static int bruteForce(int n){
    if(n<0) return 0;
    else if(n==0) return 1;
    else return bruteForce(n-1)+bruteForce(n-2)+ bruteForce(n-3);
}
    public static void main(String[] args) {
        System.out.println("This is the number of possible steps : " + climbingSteps(4));
        System.out.println("This is the number of possible steps: brute force : " + bruteForce(4));
        System.out.println("This is the number of possible steps: brute force : " + memoization(4));
        System.out.println("This is the number of possible steps: brute force : " + countWays(4));
        System.out.println("This is the number of possible steps: brute force : " + countWaysHashMap(4));
    }
}
