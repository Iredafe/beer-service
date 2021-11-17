package dafe.springframework.beerservice.dsAndAlgo;

public class MaxSubsetSumNoAdjacent {

    public static int maxSubsetSumNoAdjacentRecursive(int[] array){

        if(array.length==0) return 0;
        if(array.length==1) return array[0];
        int [] maxSums = array.clone();
        maxSums[1] = Math.max(array[0], array[1]);
        for(int index = 2; index<array.length; index++){
            maxSums[index] = Math.max(maxSums[index-1], maxSums[index-2] + array[index]);
        }
        return maxSums[array.length-1];
    }

    //I still do not fully grasp this approach -- revisit
    public static int maxSubsetSumNoAdjacentIterative(int [] array){

        if(array.length ==0) return 0;
        else if(array.length==1) return array[0];

        int first = array[1];
        int second = array[0];

        for(int index=2; index<array.length; index++){
            int current = Math.max(first, second+array[index]);
            second = first;
            first = current;
        }
     return first;
    }
    public static void main(String[] args) {

        int [] input = {75, 105, 120, 75, 90, 135,900};

        System.out.println("This is the maximum : " + maxSubsetSumNoAdjacentRecursive(input));
        System.out.println("This is the maximum : " + maxSubsetSumNoAdjacentIterative(input));
    }
}
