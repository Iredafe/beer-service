package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class Powerset {
    public static List<List<Integer>> powerset(List<Integer> array){
        return helper(array, array.size()-1);
    }

    public static List<List<Integer>> helper(List<Integer> array, int index){
        if(index<0){
            List<List<Integer>> emptySet = new ArrayList<>();
            emptySet.add(new ArrayList<>());
            return emptySet;
        }
        int element = array.get(index);
        List<List<Integer>> subsets = helper(array, index-1);
        int length = subsets.size();
        for (int i = 0; i<length; i++){
            List<Integer> currentSubset = new ArrayList<>(subsets.get(i));
            currentSubset.add(element);
            subsets.add(currentSubset);
        }
        return subsets;
    }

    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        System.out.println("These are the subsets : " + powerset(input));
    }
}
