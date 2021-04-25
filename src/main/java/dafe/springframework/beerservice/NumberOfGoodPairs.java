package dafe.springframework.beerservice;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        //problem statement
        //input is an array of integers
        //output os an integer
        //find the pair that has num[i]==num[j] and i<j

        //solution plan (iterative method with time complexity O(n^2))
        //initialize the number of good pair variable - counter
        //loop through the array
        //find the good pair
        //increment the counter when you get a match
        //return the count
        int counter=0;
        for(int i=0; i<nums.length; i++){
            for(int j=nums.length-1; j<i; j--){
                if(nums[i]==nums[j] && i<j){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int testArray []= new int[]{9,2,4,2,5,7,5,3,4,1,0,3,2,5};
        int testArray2 [] =new int[]{1,2,3,1,1,3};
        System.out.println("This is the number of good pairs : " + numIdenticalPairs(testArray));
        System.out.println("This is the number of good pairs : " + numIdenticalPairs(testArray2));
    }

}