package dafe.springframework.beerservice.OP;

import java.util.*;

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

    public static void twoSumWithHashSet(int index, int nums[], List<List<Integer>> listOfIntegers){
        Set<Integer> seen = new HashSet<>();

        for(int j = index+1; j<nums.length; j++){
            int complement = -nums[index] - nums[j];
            if(seen.contains(complement)){
                listOfIntegers.add(Arrays.asList(nums[index], nums[j], complement));
                while(j+1 < nums.length && nums[j] == nums[j-1]) {
                    j++;
                }
            }else{
                seen.add(nums[j]);
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {-1,0,1,2,-1,-4};
        System.out.println("These are the 3 numbers that sum up to zero: " + threeSum(array));
        System.out.println("These are the 3 numbers that sum up to zero: " + threeSumWithHashSet(array));
    }

}
