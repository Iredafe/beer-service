package dafe.springframework.beerservice.dsAndAlgo;

public class MonotonicArray {

    public static boolean isMonotonicArray(int [] array){
        return isMonotonicArrayDecreasing(array) || isMonotonicArrayIncreasing(array);
    }

    public static boolean isMonotonicArrayIncreasing(int [] input){
        for(int index = 0; index< input.length-1; index++){
            if(input[index] > input[index+1]) return false;
        }
        return true;
    }

    public static boolean isMonotonicArrayDecreasing(int [] input){
        for(int index = 0; index< input.length-1; index++){
            if(input[index] < input[index+1]) return false;
        }
        return true;
    }


    public static boolean isMonotonicArray2(int [] array){
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int index = 0; index< array.length-1; index++){
            if(array[index] > array[index + 1])
                isIncreasing = false;
            if(array[index] < array[index+1])
                isDecreasing = false;
        }
        return isDecreasing||isIncreasing;
    }

    public static void main(String[] args) {

        int[] input = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        int[] input1 ={-1, -5, -10, -1100, -900, -1101, -1102, -9001};
        int [] input2 = {};

        System.out.println("This array is monotonic : " + isMonotonicArray(input));
        System.out.println("This array is monotonic 1 : " + isMonotonicArray(input1));
        System.out.println("This array is monotonic 2 : " + isMonotonicArray(input2));


        System.out.println("This array is 2monotonic : " + isMonotonicArray2(input));
        System.out.println("This array is 2monotonic 1 : " + isMonotonicArray2(input1));
        System.out.println("This array is 2monotonic 2 : " + isMonotonicArray2(input2));

    }
}
