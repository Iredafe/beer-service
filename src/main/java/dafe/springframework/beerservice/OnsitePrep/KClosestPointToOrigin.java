package dafe.springframework.beerservice.OnsitePrep;

import dafe.springframework.beerservice.simuduck.Quack;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointToOrigin {

    private static int squaredDistance(int [] point){
        return point[0]*point[0] + point[1]*point[1];
    }

    private static int[][] kthClosestPoint(int [][] points, int k){

        Queue<int[]> maxHeap = new PriorityQueue<>((a,b)->b[0]-a[0]);

        for(int i=0; i< points.length; i++){
            int [] entry={squaredDistance(points[i]), i};

            if(maxHeap.size()<k){
                maxHeap.offer(entry);

            }else if(entry[0]<maxHeap.peek()[0]){
                maxHeap.poll();
                maxHeap.add(entry);
            }
        }

        int[][]answer = new int[k][2];
        for (int i=0; i< k; i++){
            int entryIndex = maxHeap.poll()[1];
            answer[i] = points[entryIndex];
        }
        return answer;
    }

    public static void main(String[] args) {
        int [] [] points = {{3,3},{5,-1},{-2,4}}; int k = 1;

        System.out.println("This is the kth closest point to origin (0, 0) : " +
                Arrays.deepToString(kthClosestPoint(points, k)));
    }
}
