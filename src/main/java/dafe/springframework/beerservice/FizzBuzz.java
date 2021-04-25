package dafe.springframework.beerservice;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


 public static List<String> fizzBuzz(int n){

     /*
        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
        answer[i] == "Fizz" if i is divisible by 3.
        answer[i] == "Buzz" if i is divisible by 5.
        answer[i] == i if non of the above conditions are true.
      */

     List <String> answer = new ArrayList<>();
     for(int i=1; i<=n; i++){
         if(i%5==0 && i%3==0){
             answer.add("FizzBuzz");
         }
         else if(i%5==0){
             answer.add("Buzz");
         }
         else if(i%3==0){
             answer.add("Fizz");
         }
         else{
             answer.add(Integer.toString(i));
         }
     }

return answer;
 }

    public static void main(String[] args) {

        System.out.println("This is the result for fizzBuzz : " + fizzBuzz(20));
        System.out.println("This is the result for fizzBuzz : " + fizzBuzz(25));
        System.out.println("This is the result for fizzBuzz : " + fizzBuzz(10));
        System.out.println("This is the result for fizzBuzz : " + fizzBuzz(15));
        System.out.println("This is the result for fizzBuzz : " + fizzBuzz(30));
    }

}
