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
        int currentSizes=0;
        nodesToExplore.push(new Integer[]{i,j});
        while(!nodesToExplore.empty()){
            Integer [] currentNode = nodesToExplore.pop();
            i = currentNode[0];
            j = currentNode[1];
          if(visited[i][j]) continue;
          visited[i][j] = true;
          if(matrix[i][j] == 0) continue;
          currentSizes++;

          List<Integer[]> unvisitedNeighbors = getUnvisitedNodes(i,j,matrix,visited);
          for(Integer[] neighbor : unvisitedNeighbors){
              nodesToExplore.add(neighbor);
          }
        }
        if(currentSizes>0) sizes.add(currentSizes);
    }

    public static List<Integer[]> getUnvisitedNodes(int i, int j, int[][]matrix, boolean[][]visited){
        List<Integer[]> unvisitedNeighbors = new ArrayList<>();
        if(i>0 && !visited[i-1][j]) unvisitedNeighbors.add(new Integer[]{i-1,j});
        if(i<matrix.length-1 && !visited[i+1][j]) unvisitedNeighbors.add(new Integer[]{i+1, j});
        if(j>0 && !visited[i][j-1]) unvisitedNeighbors.add(new Integer[]{i, j-1});
        if(j< matrix[0].length-1 && !visited[i][j+1]) unvisitedNeighbors.add(new Integer[]{i, j+1});
        return unvisitedNeighbors;
    }
//    {1, 0, 0, 1, 0},
//    {1, 0, 1, 0, 0},
//    {0, 0, 1, 0, 1},
//    {1, 0, 1, 0, 1},
//    {1, 0, 1, 1, 0}
    public static List<Integer> riverSizeSecondApproach(int [][] matrix){
        List<Integer> result = new ArrayList<>();
        for(int i=0; i< matrix.length; i++){
            int count = 0;
            for(int j=0; j< matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    dfs(matrix, i, j, count, result);
                }
                if(count>0) result.add(count);
            }
        }
        return result;
    }
    public static List<Integer> dfs(int [][] matrix, int i, int j, int count, List<Integer> result){
        if(i<0 || j <0 || i>= matrix.length || j>= matrix[0].length || matrix[i][j]==0) return result;
        matrix[i][j] = 0;
        count++;
        dfs(matrix,i-1, j,count, result);
        dfs(matrix, i+1, j,count, result);
        dfs(matrix, i, j-1,count, result);
        dfs(matrix, i, j+1, count, result);

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 0, 0, 1, 0},
                                    {1, 0, 1, 0, 0},
                                    {0, 0, 1, 0, 1},
                                    {1, 0, 1, 0, 1},
                                    {1, 0, 1, 1, 0}
        };

        System.out.println("These are the river sizes : " + riverSizes(matrix));
        System.out.println("These are the river sizes : " + riverSizeSecondApproach(matrix));
    }
}