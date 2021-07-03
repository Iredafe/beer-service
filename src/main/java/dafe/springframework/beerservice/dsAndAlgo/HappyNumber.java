package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashSet;

public class HappyNumber {



    public static boolean isHappyNumber(int n){

        HashSet <Integer> seen = new HashSet<>();
        if(n!=1 && !seen.contains(n)){
            seen.add(n);
            n = sumOfTheSquareOfDigit(n);
        }
        return n==1;
    }

    private static int sumOfTheSquareOfDigit(int a){

        int sum = 0;
        while (a>0){
            int rem = a%10;
            sum += (rem*rem);
            a/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println("This is the result of Happy Number : " + isHappyNumber(n));
    }
}
