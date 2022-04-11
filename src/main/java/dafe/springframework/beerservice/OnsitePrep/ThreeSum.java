package dafe.springframework.beerservice.OnsitePrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public static List<List<Integer>> threeSum(int nums[]){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i< nums.length && nums[i] <=0 ; i++){
            if(i==0 || nums[i] != nums[i-1]){
                twoSum(i, nums, result);
            }
        }
        return result;
    }

    public static void twoSum(int index, int[] array, List<List<Integer>> resultList){
        int low = index+1; int high = array.length-1;

        while(low<high){
            int sum = array[index] + array[low] + array[high];
            if(sum < 0) {
                low++;
            }
            else if(sum>0) {
                high--;
            }
            else{
             resultList.add(Arrays.asList(array[index], array[low], array[high]));
             low++;
             high--;
             while(low<high && array[low] == array[low-1]){
                 low++;
             }
            }
        }
    }

    public static List<List<Integer>> threeSumWithHashSet(int [] array){
        List<List<Integer>> result = new ArrayList<>();
         Arrays.sort(array);
         for(int i=0; i<array.length && array[i] <=0; i++){
                if(i==0||array[i]!=array[i-1]) {
                    twoSumWithHashSet(i, array, result);
                }
         }
         return result;
    }
    public static void main(String[] args) {
        int array[] = {-1,0,1,2,-1,-4};
        System.out.println("These are the 3 numbers that sum up to zero: " + threeSum(array));
    }

}
