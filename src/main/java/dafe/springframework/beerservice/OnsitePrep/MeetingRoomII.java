package dafe.springframework.beerservice.OnsitePrep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomII {

    private static int meetingRoomsII(int [][] intervals){

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        PriorityQueue<Integer> rooms = new PriorityQueue<>(intervals.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        rooms.add(intervals[0][1]);
        for(int i=1; i< intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start >= rooms.peek()){
                rooms.poll();
            }
            rooms.add(end);
        }
        return rooms.size();
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
