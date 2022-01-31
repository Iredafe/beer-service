package dafe.springframework.beerservice.dsAndAlgo;

import java.util.*;

public class FourSum1 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums==null || nums.length < 4) return result;
        Arrays.sort(nums);
        for(int i=0; i< nums.length-3; i++){
            if(i>0 && nums[i] == nums[i-1] ) continue;
            for(int j=i+1; j<nums.length-2; j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int start = j+1;
                int end = nums.length-1;
                while(start < end){
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if(sum == target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        start++;
                        end--;
                        while(start<end && nums[start] == nums[start-1]) start++;
                        while(start<end && nums[end] == nums[end+1]) end--;
                    }
                    else if(sum<target){
                        start++;
                    }else{
                        end--;
                    }
                }
            }

        }
        return result;

    }

    public static List<List<Integer>> fourSumHashMap(int [] nums, int target){
        Map<Integer, Set<List<Integer>>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
         for(int i=1; i< nums.length-1; i++){
            for(int j=i+1; j <nums.length; j++ ){
                int currentSum = nums[i] + nums[j];
                int difference = target - currentSum;
                if(map.containsKey(difference)){
                    for(List<Integer> pair : map.get(difference)){
                        result.add(Arrays.asList(nums[i], nums[j], pair.get(0), pair.get(1)));
                    }
                }
            }
            for(int k=0; k<i; k++){
                int currentSum = nums[i] + nums[k];
                List<Integer> pair = Arrays.asList(nums[i], nums[k]);
                if(!map.containsKey(currentSum)){
                    Set<List<Integer>> pairedList = new HashSet<>();
                    pairedList.add(pair);
                    map.put(currentSum,pairedList);
                }else{
                    map.get(currentSum).add(pair);
                }
            }
        }
         return result;
    }

    public static void main(String[] args) {
        int [] nums = {-3,-2,-1,0,0,1,2,3};
        int target = 0;

        System.out.println("This is the result for 4 Sum : " + fourSum(nums, target));
        System.out.println("This is the result for 4 Sum with hashMap: " + fourSumHashMap(nums, target));
    }
}
