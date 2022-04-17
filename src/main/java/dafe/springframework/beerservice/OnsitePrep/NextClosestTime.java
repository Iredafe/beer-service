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
            if(minutes == 24*60) {
                minutes = 0;
            }
           int H = minutes/60/10;
            int h = minutes/60%10;
            int M = minutes%60/10;
            int m = minutes%60%10;

            if(!set.contains(H) && !set.contains(h) && set.contains(M) && set.contains(m)){
                continue;
            }
            return H + "" + h + ":" + M +""+ m;
        }

    }

    public static void main(String[] args) {
        String time = "19:34";
        System.out.println("The next closest time to " + time + " is : " + nextClosestTime(time));
    }

}
