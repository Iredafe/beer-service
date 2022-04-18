package dafe.springframework.beerservice.OnsitePrep;

public class MaximumDistanceToClosestPerson {

    private static int maximumDistanceToClosestPerson(int[] seats){
        int seatLength = seats.length;
        int emptySeats = 0;
        int maximumDistance = 0;
        int seatsToTheLeft = -1;
        int seatsToTheRight = -1;

        for(int i=0; i<seatLength; i++){
            if(seats[i] == 1){
                emptySeats=0;
            }
        }
    }

    public static void main(String[] args) {
        int seats[] = {1,0,0,0,1,0,1};
        System.out.println("This is the maximum distance to closest person : " + maximumDistanceToClosestPerson(seats));
    }
}
