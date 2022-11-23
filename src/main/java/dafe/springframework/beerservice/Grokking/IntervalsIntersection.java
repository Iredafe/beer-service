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

    private static Interval[] merge(Interval [] firstList, Interval [] secondList){
        List<Interval> resultList = new ArrayList<>();
        int i=0, j=0;
        int start=0;
        int end=0;
        while (i<firstList.length && j< secondList.length){
            if (firstList[i].start >= secondList[j].start
                    && firstList[i].start <= secondList[j].end
            || secondList[j].start >= firstList[i].start && secondList[j].start <=firstList[i].end){
                start=Math.max(firstList[i].start, secondList[j].start);
                end=Math.min(firstList[i].end, secondList[j].end);
            }
            resultList.add(new Interval(firstList[i].start, firstList[i].end));

            if(firstList[i].end < secondList[j].end) i++;
            else j++;

        }
        resultList.add(new Interval(start,end));
        return resultList.toArray(new Interval[0]);
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
