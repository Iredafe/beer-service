package dafe.springframework.beerservice.Grokking;

public class SeparateDuplicates {

   static int remove(int [] array){
        int nextNonDuplicates=1;

        for(int i=0; i<array.length; i++){
            if(array[nextNonDuplicates-1] != array[i]){
                array[nextNonDuplicates] = array[i];
                nextNonDuplicates++;
            }
        }
        return nextNonDuplicates;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
        System.out.println(remove(arr));

        arr = new int[] { 2, 2, 2, 11 };
        System.out.println(remove(arr));
    }

}
