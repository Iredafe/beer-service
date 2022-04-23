package dafe.springframework.beerservice.OnsitePrep;

public class MeetingRoomII {

    public int minMeetingRooms(Interval[] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for(int i=0; i<intervals.length; i++) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }
}

    private class Interval {
        int start;
        int end;

        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    }
