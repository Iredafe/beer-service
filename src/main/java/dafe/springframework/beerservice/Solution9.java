package dafe.springframework.beerservice;

public class Solution9 {
        public static boolean containsDuplicate(int[] nums) {
            //problem statement
            //input is an array
            //output is a boolean
            //return true if theer is a duplicate in the array
            //return false if there i s no duplicate


            //solution statemnt: expensive soln O(n^2)
            //use 2 pointer
            //iterate through the arraywith each pointer
            //if there is a duplicate, return true
            //else return false
            boolean isDuplicate = false;
            for(int i=0; i< nums.length; i++){
                for(int j=nums.length-1; j>i;j--){
                    if(nums[i]==nums[j] ){
                        isDuplicate = true;
                    }
                }
            }
            return isDuplicate;
        }



    public static void main(String[] args) {
            int [] nums= {1,2,3,4,2};
        System.out.println("Answer is : " + containsDuplicate(nums));
    }
}
