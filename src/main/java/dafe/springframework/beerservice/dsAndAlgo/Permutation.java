package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
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
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(array);
        System.out.println("These are the permutations : " + getAllPermutations(array));
    }
}
