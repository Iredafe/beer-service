package dafe.springframework.beerservice.dsAndAlgo;

public class QuickSelect {

    public static void main(String[] args) {
        int input [] = {8, 5, 2, 9, 7, 6, 3};
        System.out.println("This is the kth smallest number : " + quickselect(input,3));
    }

    private static int quickselect(int[] array, int k) {
        int postion = k-1;
        return quickselectHelper(array, postion, 0, array.length-1);
    }

    private static int quickselectHelper(int[] array, int positon, int start, int end) {

        while(true){
         if(start > end){
             throw new RuntimeException("There is something here...!");
         }
        }
    }
}
