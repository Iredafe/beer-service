package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {

    public static int[] greaterElement(int[] num1, int [] num2){
        int j;
        int[] result = new int[num1.length];
        for(int i=0; i< num1.length; i++){
            boolean found = false;
            for(j=0; j< num2.length; j++){
                if(found && num2[j] > num1[i]){
                    result[i] = num2[j];
                    break;
                }
                if(num1[i] == num2[j]) found=true;

            }
            if(j==num2.length){
                result[i] = -1;
            }
        }
        return result;
    }

    public static int[] nextGreaterElement(int nums1[], int nums2[]){

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums2.length; i++){
            map.put(nums2[i], i);
        }
        int j;
        int result[] = new int [nums1.length];

        for(int i=0; i< nums1.length; i++){
            for(j=map.get(nums1[i]) +1; j< nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    result[i] = nums2[j];
                    break;
                }
            }
            if(j==nums2.length) result[i] = -1;
        }
        return result;
    }

    public static int[] greaterElementStack(int nums1[], int nums2[]){

        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums2.length; i++){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums1 = {4,1,2}, nums2 = {1,3,4,2};

        System.out.println("Return the greater elements : " + Arrays.toString(greaterElement(nums1,nums2)));
        System.out.println("Return the greater elements : " + Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
}
