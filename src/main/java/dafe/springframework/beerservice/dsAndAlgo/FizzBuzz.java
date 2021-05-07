package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.HashMap;
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

 public static List<String> fizzBuzzhash(int n){

     List<String> answer = new ArrayList<>();

     HashMap<Integer, String> myHashMap = new HashMap<>(){{
         put(3,"Fizz");
         put(5, "Buzz");
     }
     };
     for(int i=1; i<=n; i++){
         String numAndStr = "";
         for(Integer myKey : myHashMap.keySet()){
             if(i%myKey ==0){
                 numAndStr += myHashMap.get(myKey);
             }
             if(numAndStr.equals("")){
                 numAndStr+= Integer.toString(i);
             }
         }
         answer.add(numAndStr);
     }
     return answer;
 }


    public static void main(String[] args) {

        System.out.println("This is the result for fizzBuzzhash : " + fizzBuzzhash(25));
        System.out.println("This is the result for fizzBuzz : " + fizzBuzz(25));
        System.out.println("This is the result for fizzBuzzHash : " + fizzBuzzhash(10));
        System.out.println("This is the result for fizzBuzz : " + fizzBuzz(10));
        }

}
