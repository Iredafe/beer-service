package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RiverSizes {

    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> sizes = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                if(visited[i][j]) continue;
                traverseNodes(i,j, matrix, visited, sizes);
            }
        }
        return sizes;
    }


    public static void traverseNodes(int i, int j, int[][]matrix, boolean[][]visited, List<Integer> sizes){
        Stack<Integer[]> nodesToExplore = new Stack<>();
        nodesToExplore.push(new Integer[]{i,j});
        if(!nodesToExplore.empty()){

        }
    }

    public static List<Integer[]> getUnvisitedNodes(int i, int j, int[][]matrix, boolean[][]visited){
        List<Integer[]> unvisitedNeighbors = new ArrayList<>();
        if(i>0 && !visited[i-1][j]) unvisitedNeighbors.add(new Integer[]{i-1,j});
        if(i<matrix.length && !visited[i+1][j]) unvisitedNeighbors.add(new Integer[]{i+1, j});
        if(j>0 && !visited[i][j-1]) unvisitedNeighbors.add(new Integer[]{i, j-1});
        if(j< matrix[0].length && !visited[i][j+1]) unvisitedNeighbors.add(new Integer[]{i, j+1});
        return unvisitedNeighbors;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0}
        };

        System.out.println("These are the river sizes : " + riverSizes(matrix));
    }
}