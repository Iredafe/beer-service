package dafe.springframework.beerservice.dsAndAlgo;

public class QuickSort {

    public static int[] quickSort(int [] array) {
        quickSortHelper(array, 0, array.length-1);
        return array;
    }

    public static void quickSortHelper(int [] array, int startIdx, int endIdx){
        int pivotIdx = startIdx;
        int leftIdx = startIdx+1;
        int rightIdx = endIdx;
        if(startIdx >= endIdx) return ;
     while (leftIdx < rightIdx){
       if(array[leftIdx] > array[pivotIdx] && array[rightIdx] < array[pivotIdx]){
             swap(array, leftIdx, rightIdx);
         }
         if(array[leftIdx] <= array[pivotIdx]){
             leftIdx++;
         }
         if(array[rightIdx] >= array[pivotIdx]){
             rightIdx--;
         }
     }
        return new int[]{};
    }

    public static void swap(int [] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int [] input ={8, 5, 2, 9, 5, 6, 3};

        System.out.println("This is the quick sort result : " + quickSort(input));
    }
}
