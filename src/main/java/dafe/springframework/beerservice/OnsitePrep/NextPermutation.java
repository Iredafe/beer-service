package dafe.springframework.beerservice.OnsitePrep;

public class NextPermutation {

    public static int[] findNextPermutation(int [] inputArray){
        int i = inputArray.length - 2;

        while(i>=0 && inputArray[i+1] < inputArray[i]){
            i--;
        }
        if(i>=0){
            int j = inputArray.length-1;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int [] array = {1,2,3};

        System.out.println("This is the next permutation : " + findNextPermutation(array));
    }
}
