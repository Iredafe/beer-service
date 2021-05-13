package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=numbers.length-1; i>=0; i--){
                if(i+j == target){
                    result.add(i);
                    result.add(j);
                }
            }
        }
        int newArray[] = new int[result.size()];
        for (int i=0; i<result.size(); i++){
            newArray[i] = result.get(i);
        }
        return newArray;
    }

    public static void main(String[] args) {
        int test[] = {2,7,11,15};

        System.out.println("THese are the two numbers " + twoSum(test, 9) );
    }



}
