package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElement {

    private static int[] topKFrequentElement(int [] array, int k){
        HashMap<Integer, Integer> numberFrequencyMap = new HashMap<>();
        for(int number : array){
        numberFrequencyMap.put(number, numberFrequencyMap.getOrDefault(number,0)+1);
        }
        PriorityQueue<Integer> heap= new PriorityQueue<>((num1, num2)->numberFrequencyMap.get(num1)- numberFrequencyMap.get(num2));

        for(int element : numberFrequencyMap.keySet()){
            heap.add(element);
            if(heap.size() > k){
                heap.poll();
            }
        }
        int [] result = new int [k];
        for(int i=k-1; i>=0; i--){
            result[i]=heap.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int [] array = {1,1,1,2,2,3};
        int k = 3;

        System.out.println("The top k element is : " + Arrays.toString(topKFrequentElement(array,k)));
    }
}
