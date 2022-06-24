package dafe.springframework.beerservice.Gym;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindPermutation {

    private static List<List<Integer>> findPermutations(int [] array){

        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> permutations = new LinkedList<>();
        permutations.add(new ArrayList<>());
        for(int currentNumber : array){
            int size = permutations.size();
            for(int i=0; i<size; i++){
                List<Integer> oldPermutation = permutations.poll();
                for(int j=0; j<=oldPermutation.size();j++){
                    List<Integer> newPermutation = new ArrayList<>(oldPermutation);
                    newPermutation.add(j, currentNumber);
                    if(newPermutation.size()==array.length){
                        result.add(newPermutation);
                    }else{
                        permutations.add(newPermutation);
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<List<Integer>> result = findPermutations(new int[] { 1, 3, 5 });
        System.out.print("Here are all the permutations: " + result);
    }
}
