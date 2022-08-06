package dafe.springframework.beerservice.Grokking;

import java.util.*;

public class MergedIntervals {

   static class Interval{
        int start;
        int end;

        public Interval(int start, int end){
            this.start=start;
            this.end = end;
        }
    }

    private static List<Interval> merge(List<Interval> input) {
        if(input.size() <2) return input;
       List<Interval> mergedIntervals = new LinkedList<>();
        Collections.sort(input,(a,b)-> Integer.compare(a.start,b.start));
        Iterator<Interval> intervalIterator = input.iterator();
        Interval interval = intervalIterator.next();
        int start = interval.start;
        int end = interval.end;

        while (intervalIterator.hasNext()){
            interval = intervalIterator.next();
            if(interval.start<=end){
                end = Math.max(interval.end, end);
            }else {
                mergedIntervals.add(new Interval(start,end));
                start=interval.start;
                end=interval.end;
            }
        }
        mergedIntervals.add(new Interval(start,end));
        return mergedIntervals;
    }

    private static int[][] mergeIntervals(int[][] intervals){
        LinkedList<int[]> listOfIntervals = new LinkedList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
        for(int[] interval : intervals){
            if(listOfIntervals.isEmpty() || listOfIntervals.getLast()[1] < interval[0]){
                listOfIntervals.getLast()[1] = interval[1];
            }
        }
       return new int[][]{};
    }

    public static void main(String[] args) {
        int [][] intervalInput = {{1,3},{2,6},{8,10},{15,18}};

        System.out.println("merge interval arrays : " + mergeIntervals(intervalInput));
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
        for (Interval interval : merge(input))
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
