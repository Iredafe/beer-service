package dafe.springframework.beerservice.OnsitePrep;

public class MeetingRoomsI {

    public static void main(String[] args) {
        int [][] meetingRooms = {{0,30},{5,10},{15,20}};
        System.out.println("I can attend all meetings ? " + intervals(meetingRooms));
    }
}
