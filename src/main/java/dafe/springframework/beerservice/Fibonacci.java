package dafe.springframework.beerservice;

public class Fibonacci {


    public static int fibonacciNumberGenerator(int number){
        int result = 0;
        if(number >= 0 && number<=2) return number;

       result= fibonacciNumberGenerator(number-3)* fibonacciNumberGenerator(number-2)+ fibonacciNumberGenerator(number-1);

        return  result;
    }


    public static void main(String[] args) {
        int test1 = 3;
        System.out.println("This is the result for number generator function test 1 : " + fibonacciNumberGenerator(test1));
    }


}
