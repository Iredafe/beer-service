package dafe.springframework.beerservice.dsAndAlgo;

public class Fibonacci {

    public static int fibonacciNumberGenerator(int number){
        int result = 0;
        if(number >= 0 && number<=1) return number;
        if(number <0) return -1;
         result= fibonacciNumberGenerator(number-1)+ fibonacciNumberGenerator(number-2);
        return  result;
    }

    public static int bottomUpDynamicProgramming(int number){

        if(number>=0 && number<=2){
         return number;
        }

        int [] cache = new int[number];
        cache[0]=0;
        cache[1]=1;

        for(int i=2; i<number; i++){
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[number-1]+cache[number-2];
    }

    public static int bottomUpDynamicProgramming2(int number) {

        if(number>=0&& number<=2) return number;
        int previousValue1=0;
        int previousValue2= 1;

        for(int i=2; i<number; i++){
            int result = previousValue1+previousValue2;

            previousValue1=previousValue2;
            previousValue2=result;
        }
        return previousValue1+previousValue2;
    }
        public static void main(String[] args) {
        int test3= 2;
        int test4 = 9;

        System.out.println("This is the result for number generator function test 1 : " + fibonacciNumberGenerator(test3));
        System.out.println("This is the result for number generator function test 2 : " + fibonacciNumberGenerator(test4));

        System.out.println("This is the result for bottom up dynamic prog function test 3 : " + bottomUpDynamicProgramming(test3));
        System.out.println("This is the result for bottom up dynamic prog function test 4 : " + bottomUpDynamicProgramming(test4));

        System.out.println("This is the result for bottom up dynamic prog function test 4 : " + bottomUpDynamicProgramming2(test3));
        System.out.println("This is the result for bottom up dynamic prog function test 5 : " + bottomUpDynamicProgramming2(test4));
    }


}
