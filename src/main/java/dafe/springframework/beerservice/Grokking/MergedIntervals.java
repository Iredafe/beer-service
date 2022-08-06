package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.List;

public class MergedIntervals {

   static class Interval{
        int start;
        int end;

        public Interval(int start, int end){
            this.start=start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();
    }
}
