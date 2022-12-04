package dafe.springframework.beerservice.Grokking;

public class FindMissingNumber {

    private static int findMissingNumber(int [] array){

        int i=0;

        while (array[i]<array.length && array[i]!=array[array[i]]){
            swap(i, array[i], array);
        }

        for (i=0; i<array.length; i++){
            if(array[i]!=i) return i;
        }
        return array.length;
    }

    private static void swap(int i, int j, int [] array){
         int temp = array[i];
         array[i] = array[j];
         array[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[] { 4, 0, 3, 1 }));
        System.out.println(findMissingNumber(
                new int[] { 8, 3, 5, 2, 4, 6, 0, 1 }));
    }
}
