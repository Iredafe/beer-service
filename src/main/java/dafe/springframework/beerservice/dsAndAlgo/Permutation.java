package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

    public static List<List<Integer>> getAllPermutations(List<Integer> array){

        List<List<Integer>> permutations = new ArrayList<>();
        getPermutations(0, array, permutations);
        return permutations;
    }

    public static void getPermutations(int i, List<Integer> array, List<List<Integer>> permutations){
         if(i==permutations.size()-1){
                permutations.add(new ArrayList<>(array));
         }else{
             for(int j=i; j<array.size()-1; j++){
                swap(array, i, j);
                getPermutations(i+1, array, permutations);
                swap(array,i, j);
             }
        }
    }

    public static void swap(List<Integer> array, int i, int j){
        int temp = array.get(i);
        array.set(i,array.get(j));
        array.set(j, temp);
    }

    public static List<List<Integer>> getPermutations1(List<Integer> array){
        List<List<Integer>> result = new ArrayList<>();
        getPermutations1(array, new ArrayList<Integer>(), result);
        return result;
    }

    public static void getPermutations1(List<Integer> array, List<Integer> currentPermutation, List<List<Integer>> result){

        if(array.size()==0 && currentPermutation.size()>0){
            result.add(currentPermutation);
        }else{
            for(int i=0; i< array.size(); i++){
                List<Integer> newArray = new ArrayList<>(array);
                List<Integer> newPerm = new ArrayList<>(currentPermutation);
                newPerm.add(newArray.get(i));
                newArray.remove(i);
                getPermutations1(newArray, newPerm, result);
            }
        }

    }

    public static List<List<Integer>> permute(int [] nums){
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, result, new ArrayList<>(), new boolean[nums.length]);
        return result;
     }

     public static void permute(int[] nums, List<List<Integer>> result, List<Integer> currentPermutation, boolean[] visited){
        if(currentPermutation.size() == nums.length){
            result.add(currentPermutation);
        }else {
            for(int i=0; i< nums.length; i++){
                if(!visited[i]){
                    visited[i] = true;
                    currentPermutation.add(nums[i]);
                    permute(nums, result, currentPermutation, visited);
                    visited[i] = false;
                    currentPermutation.remove(currentPermutation.size()-1);
                }
            }
        }
     }
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3));
        int [] nums = {1,2,3};
        System.out.println(array);
        System.out.println("These are the permutations : " + getAllPermutations(array));
        System.out.println("These are the permutations Latest: " + getPermutations1(array));
        System.out.println("These are the permutations Latest: " + permute(nums));
    }
}
