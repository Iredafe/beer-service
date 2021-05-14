package dafe.springframework.beerservice.dsAndAlgo;

public class SumOfUnique {
    public static int sumOfUnique(int [] nums){
        //problem statement:
        //input is an array of numbers
        //output is an integer sum of the unique elements, i.e that appear once in the array

        //solution statement:
        //loop through the array with 2 pointers: O(n^2) runtime
        //do a lookup on the array to see if the value exists in the array
        //if the value in a given index exists(is not unique), break out of the loop
        //if the value in a given index does not exist, sum it up with others
        //return the sum of unoique values

        int sum=0;
        for(int i=0; i<nums.length; i++){
            boolean isUnique = true;
            for(int j=0; j< nums.length; j++){
                if(nums[i]==nums[j] && i!=j){
                    isUnique=false;
                    break;
                }
            }
        if(isUnique){
            sum+= nums[i];
        }
        }
        return sum;
    }

    public static void main(String [] args){

      int [] myNum = {2,1,3,4,2,6,8};
        System.out.println("This is the sum of unique numbers : " + sumOfUnique(myNum));
    }
}
