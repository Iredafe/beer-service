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
                traverseNodes(i,j,visited, sizes);
            }
        }
        return sizes;
    }


    public static void traverseNodes(int i, int j, boolean[][]visited, List<Integer> sizes){
        Stack<Integer[]> nodesToExplore = new Stack<>();
        nodesToExplore.push(new Integer[]{i,j});
    }

    public static List<Integer> getUnvisitedNodes(int i, int j, boolean[][]visited){


        return new ArrayList<>();
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