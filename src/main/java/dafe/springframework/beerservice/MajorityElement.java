package dafe.springframework.beerservice;

public class MajorityElement {

        public static int majorityElement(int[] nums) {
            //problem statement
            //input is an array
            //output is an integer
            //the majority element always exists in the array


            //solution plan
            //I can use iterative method to loop through both ends of the array but that would be in quadratic time
            //to do it in linear time, I could use a stack or hashtable
            //store the elements in the hashtable
            //loop through the hashtable
            //whenever another elemnt is to be stored and it already exst, keep record of it
            //return the element with the majority

            int majorityCount = nums.length/2;
            for(int i=0; i<nums.length; i++){
                int count =0;
                for(int j=nums.length-1; j>=0;j--){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count>majorityCount){
                    return nums[i];
                }
            }
            return -1;
        }
    public static int majorityElement2(int[] nums) {

            int majority = nums.length/2;
            for(int i=0; i< nums.length; i++){
                int count =0;

                for(int num: nums){
                    if(nums[i]==num){
                        count++;
                    }
                }

                if(count> majority){
                    return nums[i];
                }

            }

            return -1;
    }
    public static void main(String[] args) {
            int myArray[] = new int[]{8,8,7,7,7};
        System.out.println("This is the number that appears the most : " + majorityElement(myArray));
        System.out.println("This is the number that appears the most : " + majorityElement2(myArray));
    }


    }


