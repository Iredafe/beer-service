package dafe.springframework.beerservice.OnsitePrep;

import java.util.HashSet;
import java.util.Set;

public class NextClosestTime {
    private static String nextClosestTime(String time) {
        int minutes = Integer.parseInt(time.substring(0,2)) * 60;
        minutes+=Integer.parseInt(time.substring(3));

        Set<Integer> set = new HashSet<>();
        for(char character : time.toCharArray()){
            set.add(character - '0');
        }

        while(true){
            minutes++;

        }

        return null;
    }

    public static void main(String[] args) {
        String time = "19:34";
        System.out.println("The next closest time to " + time + " is : " + nextClosestTime(time));
    }

}
