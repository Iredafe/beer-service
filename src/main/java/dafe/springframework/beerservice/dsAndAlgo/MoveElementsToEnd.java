package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementsToEnd {

public static List<Integer> moveElement(List<Integer> array, int target){
    int left = 0;
    int right = array.size()-1;

        while(left < right){

            if(array.get(right) == target) {
                right--;
            }else if(array.get(left) == target){
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


    public static int[] moveElement(int [] array, int target){
        int left = 0;
        int right = array.length-1;

        while(left < right){

            if(array[right] == target) {
                right--;
            }else if(array[left] == target){
                swap(array, left, right);
            }else{
                left++;
            }
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {

        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    public static void main(String[] args) {
//2, 1, 2, 2, 2, 3, 4, 2
        //5, 5, 5, 5, 5, 5, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12
    List<Integer> inputArray = new ArrayList<>();
        inputArray.add(5);
        inputArray.add(5);
        inputArray.add(5);
        inputArray.add(5);
        inputArray.add(5);
        inputArray.add(5);
        inputArray.add(1);
        inputArray.add(2);
        inputArray.add(3);
        inputArray.add(4);
        inputArray.add(6);
        inputArray.add(7);
        inputArray.add(8);
        inputArray.add(9);
        inputArray.add(10);
        inputArray.add(11);
        inputArray.add(12);

        int toMove = 5;
int [] input = {5, 5, 5, 5, 5, 5, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12};
        List<Integer> result = moveElement(inputArray, toMove);
        int [] result1 = moveElement(input, toMove);
        System.out.println("This is the array after moving " +toMove+ " to the end : " + result);
        System.out.println("This is the array after moving " +toMove+ " to the end : " + Arrays.toString(result1));
    }

}
