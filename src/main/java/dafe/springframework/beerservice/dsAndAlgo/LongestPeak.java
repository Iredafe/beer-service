package dafe.springframework.beerservice.dsAndAlgo;

public class LongestPeak {

    public static int longestPeak(int[]array){
        //while index is less than array length
        //check for a peak by comparing 3 consecutive integers with each other
        //once a peak is found, expand the left and right index to check the length of that peak (current peak)
        //once you hit a point that is not part of the peak, assign the length to the longest peak variable if it is longer than the current peak
        //loop again until while condition is fully met
        // return the longest peak


        int longestPeak= 0;
        int index = 1;
        while( index < array.length-1){
            boolean isPeak = array[index-1] < array[index] && array[index] > array[index+1];
            if(!isPeak){
                index++;
                continue;
            }
            int leftIndex = index-2;
            while (leftIndex >= 0 && array[leftIndex] < array[leftIndex+1]){
                leftIndex--;
            }
            int rightIndex = index+2;
            while(rightIndex < array.length && array[rightIndex] < array[rightIndex-1]){
                rightIndex++;
            }

            int currentPeakLength = rightIndex - leftIndex -1 ;
            if(currentPeakLength > longestPeak) longestPeak = currentPeakLength;
            index = rightIndex;
        }
        return longestPeak;
    }


    public static void main(String[] args) {
        int [] input ={1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};

        System.out.println("The longest peak is : " + longestPeak(input));
    }
}
