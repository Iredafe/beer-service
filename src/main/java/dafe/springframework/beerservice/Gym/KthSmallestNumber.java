package dafe.springframework.beerservice.Gym;

import java.util.PriorityQueue;

public class KthSmallestNumber {

    public static void main(String[] args) {
        int result =
                findKthSmallestNumber(new int[] { 1, 5, 12, 2, 11, 5 }, 3);
        System.out.println("Kth smallest number is: " + result);

        // since there are two 5s in the input array, our 3rd and 4th smallest numbers
        // should be a '5'
        result =
                findKthSmallestNumber(new int[] { 1, 5, 12, 2, 11, 5 }, 4);
        System.out.println("Kth smallest number is: " + result);

        result =
                findKthSmallestNumber(new int[] { 5, 12, 11, -1, 12 }, 3);
        System.out.println("Kth smallest number is: " + result);  }

    private static int findKthSmallestNumber(int[] array, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b-a);

        for(int i=0; i<k; i++){
            maxHeap.add(array[i]);
        }

        for(int i=k; i<array.length; i++){
            if(array[i] < maxHeap.peek()){
                maxHeap.poll();
                maxHeap.add(array[i]);
            }
        }

        return maxHeap.peek();
    }
}
