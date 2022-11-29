package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MinimumMeetingRooms {

    static class Meeting{
        int start;
        int end;

        public Meeting(int start, int end){
            this.start=start;
            this.end=end;
        }
    }

    private static int findMinimumMeetingRooms(List<Meeting> meetings){
        int minimumMeetingRoom = 1;
        Collections.sort(meetings, (a,b) -> a.start-b.end);
        PriorityQueue<Meeting> minHeap = new PriorityQueue<Meeting>(meetings.size(), (a,b)->a.end-b.end);
        minHeap.offer(meetings.get(0));
        for(Meeting meeting : meetings){
            Meeting currentMeeting = minHeap.peek();
            if(meeting.start <= end){
                minimumMeetingRoom++;
            }else {
                start=meeting.start;
                end=meeting.end;
            }
        }
    return 0;
}

    public static void main(String[] args) {
        List<Meeting> input = new ArrayList<Meeting>() {
            {
                add(new Meeting(1, 4));
                add(new Meeting(2, 5));
                add(new Meeting(7, 9));
            }
        };
        int result = findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);

        input = new ArrayList<Meeting>() {
            {
                add(new Meeting(6, 7));
                add(new Meeting(2, 4));
                add(new Meeting(8, 12));
            }
        };
        result = findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);

        input = new ArrayList<Meeting>() {
            {
                add(new Meeting(1, 4));
                add(new Meeting(2, 3));
                add(new Meeting(3, 6));
            }
        };
        result = findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);

        input = new ArrayList<Meeting>() {
            {
                add(new Meeting(4, 5));
                add(new Meeting(2, 3));
                add(new Meeting(2, 4));
                add(new Meeting(3, 5));
            }
        };
        result = findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);
    }
}
