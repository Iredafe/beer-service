package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.List;

public class IntervalsIntersection{
    static class Interval{
        int start;
        int end;

        public Interval(int start, int end){
            this.start=start;
            this.end=end;
        }
    }

    private static List<Interval> merge(Interval [] firstList, Interval [] secondList){

        return new ArrayList<>();
    }


    public static void main(String[] args) {
        Interval[] input1 = new Interval[] { new Interval(1, 3), new Interval(5, 6),
                new Interval(7, 9) };
        Interval[] input2 = new Interval[] { new Interval(2, 3), new Interval(5, 7) };
        Interval[] result = merge(input1, input2);
        System.out.print("Intervals Intersection: ");
        for (Interval interval : result)
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input1 = new Interval[] { new Interval(1, 3), new Interval(5, 7),
                new Interval(9, 12) };
        input2 = new Interval[] { new Interval(5, 10) };
        result = merge(input1, input2);
        System.out.print("Intervals Intersection: ");
        for (Interval interval : result)
            System.out.print("[" + interval.start + "," + interval.end + "] ");
    }
}
