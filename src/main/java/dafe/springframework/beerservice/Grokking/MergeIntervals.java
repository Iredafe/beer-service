package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.Collections;
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
        List<Interval> result = new ArrayList<>();
        Collections.sort(input, (a,b) ->Integer.compare(a.start,b.start));
        int start = 0;
        int end=0;
        for(int i=1; i< input.size(); i++){
            start = input.get(i - 1).start;
            end = input.get(i-1).end;
            int intervalStart = input.get(i).start;
            int intervalEnd = input.get(i).end;
            if(intervalStart <= end ){
                end = Math.max(intervalEnd, end);
            }else{
               result.add(new Interval(start, end));
                start = intervalStart;
                end = intervalEnd;
            }
        }
        result.add(new Interval(start,end));
        return result;
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
