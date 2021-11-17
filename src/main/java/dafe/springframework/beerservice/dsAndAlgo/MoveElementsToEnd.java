package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementsToEnd {

public static List<Integer> moveElement(List<Integer> array, int target){
    int left = 0;
    int right = array.size()-1;

        while(left < right){

            if(left<right && array.get(right) == target) right--;
            else if(array.get(left) == target){
            swap(array, left, right);
            }else{
                left++;
                }
    }
    return array;
}

    private static void swap(List<Integer> array, int i, int j) {

    int temp = array.get(j);
    array.set(j, array.get(i));
    array.set(i, temp);
    }

    public static void main(String[] args) {
//2, 1, 2, 2, 2, 3, 4, 2
    List<Integer> inputArray = new ArrayList<>();
        inputArray.add(2);
        inputArray.add(1);
        inputArray.add(2);
        inputArray.add(2);
        inputArray.add(2);
        inputArray.add(3);
        inputArray.add(4);
        inputArray.add(2);

        int toMove = 2;

        List<Integer> result = moveElement(inputArray, toMove);
        System.out.println("This is the array after moving " +toMove+ " to the end : " + result);
    }

}
