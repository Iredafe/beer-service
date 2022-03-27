package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestRange {

    public static void main(String[] args) {
        int [] input = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        System.out.println("This is the largest range : " + Arrays.toString(largestRange(input)));
    }

    private static int[] largestRange(int[] array) {

        int longestLength= 0;
        int [] bestRange = new int[2];
        Map<Integer, Boolean> map = new HashMap();

        for(int num : array){
            map.put(num, false);
        }

        for(int num: array){
            if(map.get(num)){
                continue;
            }
            map.put(num, true);
            int left = num - 1;
            int right = num+1;
            int currentLength = 1;

            while (map.containsKey(left)){
                map.put(left, true);
                currentLength++;
                left--;
            }

            while(map.containsKey(right)){
                map.put(right, true);
                currentLength++;
                right++;
            }

            if(currentLength > longestLength){
                longestLength = currentLength;
                bestRange = new int[]{left+1, right-1};
            }
        }
        return bestRange;
    }
}
