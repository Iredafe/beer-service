package dafe.springframework.beerservice.OnsitePrep;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInArray {

    private static int kthLargestNumber(int [] array, int k){
       return quickSelect(array, 0,array.length-1, k);
    }

    private static int quickSelect(int [] array, int start, int end, int position){
        while(true){

            int left = start+1;
            int right = end;
            int length=array.length;
            int pivot = start;

            while(left <= right){
                if(array[left] > array[pivot] && array[right] < array[left]){
                    swap(array, left, right);
                }
            }

        }
        return 0;
    }

    private static int findKthLargestNumber(int [] array, int k){
        PriorityQueue<Integer> heap =
                new PriorityQueue<>(Comparator.comparingInt(n -> n));

        for(int number : array){
            heap.add(number);
            if(heap.size() > k){
                heap.poll();
            }
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4}; int k = 2;

        System.out.println("This is the kth largest number : " + findKthLargestNumber(nums, k));
    }
}
