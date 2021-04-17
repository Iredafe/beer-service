package dafe.springframework.beerservice.web;

import java.util.Arrays;
import java.util.HashSet;

public class Solution6 {

    public static int[] intersection(int[] num1, int[]num2){
        //create 2 sets for the 2 arrays
        HashSet<Integer> set1 = new HashSet<>();
            for(Integer number : num1)
                set1.add(number);

            HashSet<Integer> set2 = new HashSet<>();
            for (Integer number: num2)
                set2.add(number);
            //use built in java method to get intersection
            set1.retainAll(set2);

        System.out.println("this is set1 : " + set1);
        System.out.println("this is set2 : " + set2);
        int newArray[] = new int[set1.size()];

        //convert set to an array
        int index=0;
        for(int s : set1) {
            newArray[index++] = s;
        }
        return newArray;
    }

    public static  void main(String [] args){
        int num1 [] = {2,3,4,5,1,9,2,2,1};
        int num2 [] ={1,3,8,4,4};

        System.out.println("This is the intersection : " + intersection(num1,num2));
    }
}
