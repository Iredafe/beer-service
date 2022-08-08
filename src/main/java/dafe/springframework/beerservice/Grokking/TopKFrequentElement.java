package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;

public class TopKFrequentElement {

    private static int[] topKFrequentElement(int [] array, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int number : array){
        map.put(number, map.getOrDefault(number,0)+1);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int [] array = {1,1,1,2,2,3};
        int k = 3;
    }
}
