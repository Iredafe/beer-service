package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class NumberOfWaysToTraverseGraph {
    public static int uniquePaths(int width,int height){

        int [][] numberOfWays = new int[height+1][width+1];
        for(int widthIndex =1; widthIndex < width+1; widthIndex++){
            for(int heightIndex = 1; heightIndex<height+1; heightIndex++){
                if(widthIndex ==1 || heightIndex == 1){
                    numberOfWays[heightIndex][widthIndex] = 1;
                }else{
                    int waysLeft = numberOfWays[heightIndex][widthIndex-1];
                    int waysUp = numberOfWays[heightIndex-1][widthIndex];
                    numberOfWays[heightIndex][widthIndex] = waysLeft+waysUp;
                }
            }
        }
        return numberOfWays[height][width];
    }

    public static int noOfUniquePaths(int height, int width){
        int numberOfUniquePaths[][] = new int[height][width];

        for(int [] array : numberOfUniquePaths){
            Arrays.fill(array, 1);
        }

        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                numberOfUniquePaths[i][j] = numberOfUniquePaths[i-1][j] + numberOfUniquePaths[i][j-1];
            }
        }
        return numberOfUniquePaths[height-1][width-1];
    }

    public static int numberOfWaysToTraverseGraphRecursive(int height, int width){
        if(width==1 || height==1) return 1;
        return numberOfWaysToTraverseGraphRecursive(height-1, width) + numberOfWaysToTraverseGraphRecursive(height, width-1);
    }

    public static int numberOfWaysToTraverseGraphDP(int height, int width){
        int ways[][] = new int[height+1][ width+1];

        for(int heightIdx=1; heightIdx<height+1; heightIdx++){
            for(int widthIdx=1; widthIdx<width+1; widthIdx++) {

                if (heightIdx == 1 || widthIdx == 1) {
                    ways[heightIdx][widthIdx] = 1;
                } else {
                    int waysUp = ways[heightIdx - 1][widthIdx];
                    int waysLeft = ways[heightIdx][widthIdx - 1];
                    ways[heightIdx][widthIdx] = waysUp + waysLeft;
                }
            }
        }
            return ways[height][width];
    }

    public static void main(String[] args) {
        int width = 4;
        int height= 3;

        System.out.println("These are the unique paths : " + uniquePaths(height, width) );
        System.out.println("These are the unique paths : " + numberOfWaysToTraverseGraphRecursive(height, width) );
        System.out.println("These are the unique paths : " + numberOfWaysToTraverseGraphDP(height, width));
    }
}
