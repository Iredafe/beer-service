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
//not working correctly
    public static int getNthFibBottomUp(int n) {
//        if(n==2) return 1;
//        if(n==1) return 0;
//
//        int[] memo= new int[n+1];
//        memo[0]= 0;
//        memo[1]=1;
//        for(int i=2; i<=n; i++){
//            memo[i] = memo[i-1] + memo[i-2];
//        }
//        return memo[n];

        // Write your code here.

        int memo[] = new int[n+1];
        memo[1] = 0;
        memo[2] = 1;

        for(int i = 3; i<=n; i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }

    public static int fibWithIterativeSoln(int n){

        int [] lastTwo = {0,1};
        int counter = 3;
        if(n==1)return 0;
        if(n==2) return 1;

        while (counter<=n){
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0]= lastTwo[1];
            lastTwo[1]= nextFib;
            counter++;
        }
        return lastTwo[1];
    }



    public static int getNthFibWithoutTabulization(int n){
    int [] lastTwo = {0,1};
    int counter = 3;
    while(counter<=n){
        int nextFib = lastTwo[0] + lastTwo[1];
        lastTwo[0]=lastTwo[1];
        lastTwo[1]=nextFib;
        counter++;
    }
        return n>1?lastTwo[1]: lastTwo[0];
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
        if(memo[n]==0) { //memo[n]==0 simply implies that if fib(n) has not already been computed,
            // compute the value of fib(n), but if it has already been and stored, do not compute again
            //this is because int array values are by default initialized to 0
            System.out.println("Memo is : " +memo[n]);
            memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        }
        return memo[n];
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println("The Nth fibonacci number is : " + getNthFibWithoutTabulization(n));
        System.out.println("The Nth fibonacci number is : " + getNthFibDP(n));
        System.out.println("The Nth fibonacci number is : " + fibWithIterativeSoln(n));
        System.out.println("The Nth fibonacci number is BOTTOM UP : " + getNthFibBottomUp(n));
         }

}
