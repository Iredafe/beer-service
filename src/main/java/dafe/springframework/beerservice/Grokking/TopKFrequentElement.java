package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElement {

    private static int[] topKFrequentElement(int [] array, int k){
        HashMap<Integer, Integer> numberFrequencyMap = new HashMap<>();
        for(int number : array){
        numberFrequencyMap.put(number, numberFrequencyMap.getOrDefault(number,0)+1);
        }
        PriorityQueue<HashMap> heap= new PriorityQueue<>((num1, num2)->numberFrequencyMap.get(num1)- numberFrequencyMap.get(num2));

        for(int element : numberFrequencyMap.keySet()){

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int [] array = {1,1,1,2,2,3};
        int k = 3;
    }
}
