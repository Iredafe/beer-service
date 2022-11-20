package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertIntervals {

    static class Interval{
        int start;
        int end;
        public Interval(int start, int end){
            this.start=start;
            this.end=end;
        }
    }

    private static List<Interval> insert(List<Interval> inputList, Interval newInterval){
        int start = newInterval.start;
        int end = newInterval.end;
        List<Interval> result = new ArrayList<>();
        for(Interval interval : inputList){
            if(interval.end < start){
                result.add(interval);
            } else if(interval.start <= end){
                start = Math.min(start, interval.start);
                end = Math.max(end, interval.end);
            }else{
                result.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        result.add(new Interval(start, end));
        return result;
    }

    public static void main(String[] args) {
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 3));
        input.add(new Interval(5, 7));
        input.add(new Interval(8, 12));
        System.out.print("Intervals after inserting the new interval: ");
        for (Interval interval : insert(input, new Interval(4, 6)))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(1, 3));
        input.add(new Interval(5, 7));
        input.add(new Interval(8, 12));
        System.out.print("Intervals after inserting the new interval: ");
        for (Interval interval : insert(input, new Interval(4, 10)))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(2, 3));
        input.add(new Interval(5, 7));
        System.out.print("Intervals after inserting the new interval: ");
        for (Interval interval : insert(input, new Interval(1, 4)))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();
    }
}