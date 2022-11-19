package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

    static class Interval{
    int start;
    int end;
    public Interval(int start, int end){
        this.start=start;
        this.end=end;
    }
    }

    private static List<Interval> merge(List<Interval> input){
        if(input.size() < 2) return input;

        for(int i=1; i< input.size(); i++){
            int start = input.get(i - 1).start;
            int end = input.get(i-1).end;
            int intervalStart = input.get(i).start;
            int intervalEnd = input.get(i).end;
            if(start <= input.get(i).start ){
               // intervalStart =
            }else{
                intervalEnd = Math.max(start, end);
            }
        }
        return new ArrayList<>();
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

        input = new ArrayList<Interval>();
        input.add(new Interval(6, 7));
        input.add(new Interval(2, 4));
        input.add(new Interval(5, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 6));
        input.add(new Interval(3, 5));
        System.out.print("Merged intervals: ");
        for (Interval interval : merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();
    }
}
