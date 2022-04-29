package dafe.springframework.beerservice.OnsitePrep;

import java.util.*;

class Worker{
    int quality;
    int wage;
    int ratio;

    public Worker(int quality, int wage){
        this.quality = quality;
        this.wage = wage;
        ratio = (int) (wage*1.0/quality);
    }
}
public class MinimumCostToHireKWorkers {

    private static int minCostToHireKWorkers(int [] quality, int [] wage, int k){

        List<Worker> workers = new ArrayList<>();
        for(int i=0; i<quality.length; i++){
            workers.add(new Worker(quality[i], wage[i]));
        }
        Collections.sort(workers, (a, b)->(Double.compare(a.ratio, b.ratio)));

        PriorityQueue<Worker> maxHeap = new PriorityQueue(quality, (a,b)->(b.quality - a.quality));

         int totalQuality = 0 ;
         double minCost = Double.MAX_VALUE;
    }


    public static void main(String[] args) {
        int [] quality = {10,20,5};
        int [] wage ={70,50,30};
        int k = 2;

        System.out.println("This is the minimum cost to hire " +k+ " workers : " + minCostToHireKWorkers(quality, wage, k));
    }
}
