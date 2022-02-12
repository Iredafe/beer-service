package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Stack;

public class NextGreaterElement1 {

    public static int[] greaterElement(int[] num1, int [] num2){

        int[] result = new int[num1.length];
        for(int i=0; i< num1.length; i++){
            boolean found = false;
            for(int j=0; j< num2.length; j++){
                if(found && num2[j] > num1[i]){
                    result[i] = num2[j];
                }

            }
        }
        return new int []{};
    }

    public static void main(String[] args) {
        int []nums1 = {4,1,2}, nums2 = {1,3,4,2};

        System.out.println("Return the greater elements : " + greaterElement(nums1,nums2));
    }
}
