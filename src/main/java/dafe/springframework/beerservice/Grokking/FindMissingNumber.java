package dafe.springframework.beerservice.Grokking;

public class FindMissingNumber {

    private static int[] findMissingNumber(int [] array){

        int i=0;

        while (array[i]<array.length && array[i]!=array[array[i]]){
            swap(i, array[i], array);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[] { 4, 0, 3, 1 }));
        System.out.println(findMissingNumber(
                new int[] { 8, 3, 5, 2, 4, 6, 0, 1 }));
    }
}
