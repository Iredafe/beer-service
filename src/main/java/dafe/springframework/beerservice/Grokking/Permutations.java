package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int [] array){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int number : array){
            list.add(number);
        }
        getAllPermutations(list, result, 0);
        return result;
    }

    public static void getAllPermutations(List<Integer> inputList, List<List<Integer>> permutations, int position){

        if(position == inputList.size()-1){
            permutations.add(new ArrayList<>(inputList));
        }else{
            for(int currentIndex = position; currentIndex<inputList.size(); currentIndex++){
                swap(inputList, currentIndex, position);
                getAllPermutations(inputList, permutations, position+1);
                swap(inputList, currentIndex, position);
            }
        }
    }

    private static void swap(List<Integer> array, int i, int j){
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }


    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println("These are the permutations : " + permute(nums));
    }
}
