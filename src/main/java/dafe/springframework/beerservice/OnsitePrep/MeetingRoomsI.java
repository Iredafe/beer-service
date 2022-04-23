package dafe.springframework.beerservice.OnsitePrep;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomsI {

    public static boolean intervals(int[][] meetingRooms){
        Arrays.sort(meetingRooms, (a,b)->Integer.compare(a[0],b[0]));
        for(int i=0; i<meetingRooms.length-1; i++){
            if(meetingRooms[i][1] > meetingRooms[i+1][0]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [][] meetingRooms = {{5,10},{0,30},{15,20}};
        System.out.println("I can attend all meetings ? " + intervals(meetingRooms));
    }
}
