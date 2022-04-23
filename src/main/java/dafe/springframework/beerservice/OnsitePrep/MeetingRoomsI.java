package dafe.springframework.beerservice.OnsitePrep;

import java.util.Arrays;

public class MeetingRoomsI {

    public static boolean intervals(int[][] meetingRooms){
        Arrays.sort(meetingRooms, (a, b)->Integer.compare(a[0], b[0]));
        for(int i=0; i<meetingRooms.length; i++){
            if(meetingRooms[i][0] <= meetingRooms[i+1][1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] meetingRooms = {{0,30},{5,10},{15,20}};
        System.out.println("I can attend all meetings ? " + intervals(meetingRooms));
    }
}
