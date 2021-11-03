package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class NthFibonacci {

    public static int getNthFib(int n){
    if(n==2){
        return 1;
    }else if(n==1){
        return 0;
    }

        return getNthFib(n-1) + getNthFib(n-2);
    }

    public static int getNthFibDP(int n){
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(1,0);
        memo.put(2,1);
        return getNthFibDP(n, memo);
    }

    public static int getNthFibDP(int n, Map<Integer, Integer> memo){
        if (!memo.containsKey(n)) {
            memo.put(n, getNthFibDP(n - 1, memo) + getNthFibDP(n - 2, memo));
        }
        return memo.get(n);
    }

    public static int fib(int n) {
        int[] memo = new int[n+1];
        return fib(n, memo);

    }

    public static int fib(int n, int [] memo){
        if(n==2) return 1;
        if(n==1) return 0;

        memo[n] = fib(n-1, memo) + fib(n-2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("The Nth fibonacci number is : " + fib(n));
    }

}
