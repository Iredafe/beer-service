package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class SmallestDifference {

    public static int[] smallestDifference(int [] firstArray, int [] secondArray){
        //create 2 hashmap stores for both arrays
        //loop through the first hashmap and store each value in the firs array
        //loop through the second hashmap and subtract
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        int smallestDifference = Integer.MAX_VALUE;
        int currentDifference = Integer.MAX_VALUE;
        int [] result = new int[2];
        int indexOne = 0, indexTwo = 0;
        while(indexOne<firstArray.length && indexTwo< secondArray.length){
            int firstNum = firstArray[indexOne];
            int secondNum=secondArray[indexTwo];
            if(firstNum < secondNum){
                currentDifference =  secondNum-firstNum ;
                indexOne++;
            }else if(secondNum < firstNum){
                currentDifference =  firstNum-secondNum;
                indexTwo++;
            }else {
                return new int[]{firstNum,secondNum};
            }
            if(smallestDifference > currentDifference){
                smallestDifference=currentDifference;
                result = new int[]{firstNum, secondNum};
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int [] input1 = {-1, 5, 10, 20, 28, 3};
        int [] input2 ={26, 134, 135, 15, 17 };
        int []answer = smallestDifference(input1, input2);
        System.out.println("These are the numbers with the smallest difference : " + Arrays.toString(answer));
    }
}
