package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0, right = numbers.length-1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum>target){
                right--;
            }else if(sum< target){
                left++;
            }else {
                return new int[]{left+1, right+1};
            }
        }
 return new int[]{};
    }

    /*
    {
  "array": [3, 5, -4, 8, 11, 1, -1, 6],
  "targetSum": 10
}
    */
    public static void main(String[] args) {
        int test[] = {3, 5, -4, 8, 11, 1, -1, 6};

        System.out.println("THese are the two numbers " + twoSum(test, 10) );
    }



}
