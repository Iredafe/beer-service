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

    public static List<List<Integer>> powersetIterative(List<Integer> array){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (Integer element : array){
            int size = result.size();
            for(int i=0; i<size; i++) {
                List<Integer> currentSubset = new ArrayList<>(result.get(i));
            currentSubset.add(element);
            result.add(currentSubset);
            }
        }
        return result;
    }

    public static List<List<Integer>> powerSet(List<Integer> array){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for(Integer element : array){

        }

        return result;
    }
     public static void main(String[] args) {

        List<Integer> input = new ArrayList<>();
        List<Integer> input2 = new ArrayList<>();

        input.add(1);
        input.add(2);
        input.add(3);


        System.out.println("These are the subsets : " + powerset(input));
         input2.add(1);
         input2.add(2);
         input2.add(3);
        System.out.println("These are the subsets iterative: " + powersetIterative(input2));
    }
}
