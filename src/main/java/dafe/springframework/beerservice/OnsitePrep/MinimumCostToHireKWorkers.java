package dafe.springframework.beerservice.OnsitePrep;

import java.util.*;

class Worker{
    static int quality;
    static int wage;
    static double ratio;

    public Worker(int quality, int wage){
        this.quality = quality;
        this.wage = wage;
        ratio = (wage*1.0/quality);
    }
}

class MinimumCostToHireKWorkers {

    private static double minCostToHireKWorkers(int [] quality, int [] wage, int k){

        List<Worker> workers = new ArrayList<>();
        for(int i=0; i<quality.length; i++){
            workers.add(new Worker(quality[i], wage[i]));
        }
        Collections.sort(workers, (a, b)->Double.compare(a.ratio, b.ratio));

        PriorityQueue<Worker> maxHeap = new PriorityQueue((a,b)-> b.quality - a.quality);
         int totalQuality = 0 ;
         double minCost = Double.MAX_VALUE;

         for(Worker worker : workers){
             maxHeap.offer(worker);
             totalQuality+=worker.quality;

             if(maxHeap.size() > k){
                 Worker removedWorker = maxHeap.poll();
                 totalQuality -= removedWorker.quality;
             }
             if(maxHeap.size() == k){
                 minCost = Math.min(totalQuality * worker.ratio, minCost);
             }
         }
         return minCost;
    }


    public static void main(String[] args) {
        int [] quality = {10,20,5};
        int [] wage ={70,50,30};
        int k = 2;

        System.out.println("This is the minimum cost to hire " +k+ " workers : " + minCostToHireKWorkers(quality, wage, k));
    }
}
