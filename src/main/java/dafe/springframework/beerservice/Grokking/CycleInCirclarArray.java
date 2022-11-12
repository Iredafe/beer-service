package dafe.springframework.beerservice.Grokking;

public class CycleInCirclarArray {

    public static boolean loopExists(int [] array){
        for(int i=0; i<array.length; i++){
            int slow=i, fast=i;

            boolean isForward = array[i] >=0;

            do{
                slow = findNextIndex(array, isForward, slow);
                fast = findNextIndex(array, isForward, fast);

                if(fast!=-1){
                    fast = findNextIndex(array, isForward, fast);
                }
            }while ()
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(loopExists(new int[] { 1, 2, -1, 2, 2 }));
        System.out.println(loopExists(new int[] { 2, 2, -1, 2 }));
        System.out.println(loopExists(new int[] { 2, 1, -1, -2 }));
    }
}
