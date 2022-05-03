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
/// using quickselect

    private static void swap(int i, int j, int [][] array){
        int [] temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int getDistance(int [] point1, int [] point2){
        return point1[0]* point1[0] - point2[0] * point2[0]
                + point1[1] * point1[1] - point2[1] * point2[1];
    }

    private static int findPivot(int [][] points, int left, int right){
        int [] pivotValue = points[left];
        int pivotIndex = left;
        left++;

        while (left<=right){
            if (getDistance(points[left], pivotValue) <= 0) {
                left++;
            }else if(getDistance(points[right], pivotValue) >= 0){
                right--;
            }else{
                swap(left, right, points);
            }
        }
        swap(right, pivotIndex, points);
        return right;
    }

    private static int kClosest(int [][] points, int k){

    }

    public static void main(String[] args) {
        int [] [] points = {{3,3},{5,-1},{-2,4}}; int k = 1;

        System.out.println("This is the kth closest point to origin (0, 0) : " +
                Arrays.deepToString(kthClosestPoint(points, k)));
    }
}
