package dafe.springframework.beerservice.dsAndAlgo;

public class NthFibonacci {

    public static int getNthFib(int n){
    if(n==2){
        return 1;
    }else if(n==1){
        return 0;
    }

        return getNthFib(n-1) + getNthFib(n-2);
    }


    public static void main(String[] args) {
        int n = 6;
        System.out.println("The Nth fibonacci number is : " + getNthFib(n));
    }

}
