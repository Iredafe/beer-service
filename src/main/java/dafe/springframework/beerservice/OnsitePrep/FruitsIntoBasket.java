package dafe.springframework.beerservice.OnsitePrep;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasket {

    public static int fruitIntoBasket(int [] array){
        int left = 0;
        int right = 0;
        int max = 0;

        Map<Integer, Integer> map = new HashMap();

        while(right < array.length){
            map.put(array[right], right);

            if(map.size()==3){
                int smallestIndex = Collections.min(map.values());
                map.remove(array[smallestIndex]);
                left = smallestIndex+1;
            }
            max = Math.max(max, right-left+1);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        int [] input = {1,2,3,2,2};

        System.out.println("This is the number of fruit that got into the basket : " + fruitIntoBasket(input));
    }
}
