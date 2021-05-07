package dafe.springframework.beerservice.dsAndAlgo;

public class DynamicProgramming {

    public static int climbStairs(int stepNumber){

        if(stepNumber>=0 && stepNumber<=2) return stepNumber;

       int cache[] = new int[stepNumber+1];
       cache[1]=1;
       cache[2]=2;

       for (int i=3; i<=stepNumber; i++){
           cache[i]= cache[i-1] + cache[i-2];
       }
       return cache[stepNumber];
    }


    public static void main(String[] args) {
        System.out.println("The number of steps are : " + climbStairs(3));
    }
}
