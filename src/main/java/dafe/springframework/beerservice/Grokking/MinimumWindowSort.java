package dafe.springframework.beerservice.Grokking;

public class MinimumWindowSort {

    private static int sort(int [] array){

        int left=0, right=array.length-1;

        while(left > 0 && array[left] > array[left-1])
            left++;

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sort(new int[] { 1, 2, 5, 3, 7, 10, 9, 12 }));
        System.out.println(sort(new int[] { 1, 3, 2, 0, -1, 7, 10 }));
        System.out.println(sort(new int[] { 1, 2, 3 }));
        System.out.println(sort(new int[] { 3, 2, 1 }));

    }
}
