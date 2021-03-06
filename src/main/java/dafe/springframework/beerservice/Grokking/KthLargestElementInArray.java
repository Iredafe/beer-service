package dafe.springframework.beerservice.Grokking;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInArray {

    private static int kthLargestNumber(int [] array, int k){
     int size = array.length;
     return quickSelect(array, 0,array.length-1, size-k);
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
                }else if(array[left] <= array[pivot]){
                    left++;
                }else {
                    right--;
                }
            }
            swap(array, right, pivot);

            if(right == position) {
                return array[right];
            }
            else if(right < position){
                start = right+1;
            }else end = right-1;
        }
    }

    private static void swap(int [] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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
        int [] nums1 = {3,2,3,1,2,4,5,5,6}; int k2 = 9;

        System.out.println("This is the kth largest number : " + findKthLargestNumber(nums, k));
        System.out.println("This is the kth largest number quickselect: " + kthLargestNumber(nums, k));
        System.out.println("This is the kth largest number 2: " + findKthLargestNumber(nums1, k2));
        System.out.println("This is the kth largest number quickselect2: " + kthLargestNumber(nums1, k2));
    }
}
