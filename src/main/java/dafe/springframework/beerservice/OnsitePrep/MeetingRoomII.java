package dafe.springframework.beerservice.OnsitePrep;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomII {

    private static int meetingRoomsII(int [][] intervals){

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        return 0;
    }
    public static int minMeetingRooms(Interval[] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for(int i=0; i<intervals.length; i++) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int rooms = 0;
        int endsItr = 0;

        for(int i=0; i<starts.length; i++){
            if(starts[i] < ends[endsItr]) rooms++;
            else endsItr++;
        }
        return rooms;
}

    private static class Interval {
        int start;
        int end;

        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Interval[] intervals = new Interval[]{new Interval(0,30), new Interval(5,10), new Interval(15,20)};
        int [][] interval = {{0,30},{5,10},{15,20}};

        System.out.println("number of conference rooms are : " + minMeetingRooms(intervals));
    }
    }
