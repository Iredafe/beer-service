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
            minutes = (minutes+1) %(24*60);
            int [] nextTime = {(minutes/60)/10, (minutes/60)%10, (minutes%60)/10, (minutes%60)%10};
            boolean isValid = true;
            for (int digit : nextTime){
               if(!set.contains(digit)){
                   isValid = false;
                   continue;
               }
            }

            if(isValid){
                return String.format("%02d:%02d", minutes/60, minutes%60);
            }
        }
    }

    public static void main(String[] args) {
        String time = "19:34";
        System.out.println("The next closest time to " + time + " is : " + nextClosestTime(time));
    }

}
