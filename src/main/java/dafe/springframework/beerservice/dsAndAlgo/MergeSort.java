package dafe.springframework.beerservice.dsAndAlgo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static int[] mergeSort(int [] array){
        if(array.length == 1) return array;
        int mid = array.length/2;
        int [] leftHalf = Arrays.copyOfRange(array, 0, mid);
        int [] rightHalf = Arrays.copyOfRange(array, mid, array.length);
        return mergeBothArrays(mergeSort(leftHalf), mergeSort(rightHalf));
    }

    private static int[] mergeBothArrays(int[] leftHand, int [] rightHand) {
    int i =0;
    int j=0;
    int k=0;
    int [] sortedArray = new int[leftHand.length + rightHand.length];
        while(i<leftHand.length && j< rightHand.length ){
            if(leftHand[i] <= rightHand[j]){
                sortedArray[k++] = leftHand[i++];
            }else{
                sortedArray[k++] = rightHand[j++];
            }
        }
        while (i<leftHand.length){
            sortedArray[k++] = leftHand[i++];
        }
        while (j< rightHand.length){
            sortedArray[k++] = rightHand[j++];
        }

        return sortedArray;
    }

    public static List<Integer> mergeSort1(ArrayList<Integer> list){
    if(list.isEmpty()) return new ArrayList<>();
    int mid = list.size() / 2;
    List<Integer> leftList = list.subList(0, mid);
    List<Integer> rightList = list.subList(mid, leftList.size());
        return mergeBothLists(leftList, rightList);
    }

    public static List<Integer> mergeBothLists(List<Integer> leftList, List<Integer> rightList){
        int i=0; int j = 0; int k=0;
        List<Integer> sortedList = new ArrayList<>();
        while(i < leftList.size() && j < rightList.size()){
            if(leftList.get(i) <= rightList.get(j)){
                sortedList.set(k++, leftList.get(i++));
            }else{
                sortedList.set(k++, rightList.get(j++));
            }
        }

        while(i< leftList.size()){
            sortedList.set(k++, leftList.get(i++));
        }
        while(j< rightList.size()){
            sortedList.set(k++, rightList.get(i++));
        }
        return sortedList;
    }
    public static void main(String[] args) {

        int [] input = {9,3,5,2,1,3,5,8,7};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList());
        System.out.println("This is the sorted result : " + Arrays.toString(mergeSort(input)));
    }
}
