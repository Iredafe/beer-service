package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class CycleInGraph {

    public static boolean cycleInGraph(int [][] edges){
        int numberOfNodes = edges.length;
        boolean[] visited = new boolean[numberOfNodes];
        boolean[] currentlyInStack = new boolean[numberOfNodes];
        Arrays.fill(visited, false);
        Arrays.fill(currentlyInStack, false);

        for(int node =0; node < edges.length; node++){
            if(visited[node]){
                continue;
            }
            boolean containsCycle = isNodeInCycle(node, edges, visited, currentlyInStack);
            if(containsCycle) return true;
        }
        return false;
    }

    public static boolean isNodeInCycle(int node, int [][]edges, boolean visited[], boolean []currentlyInStack){
        visited[node]=true;
        currentlyInStack[node] = true;
        boolean containsCycle = false;
        int [] neighbors = edges[node];
        for(int neighbor : neighbors){
            if(!visited[neighbor]){
                containsCycle = isNodeInCycle(neighbor, edges, visited, currentlyInStack);            }
            if(containsCycle){
                return true;
            }else if(currentlyInStack[neighbor]){
                return true;
            }
        }
        currentlyInStack[node] = false;
      return false;
    }
    public static int WHITE =0;
    public static int GREY =1;
    public static int BLACK =3;

    public static boolean isGraphCycle(int [][]edges){
        int numberOfNodes = edges.length;
        int colors[] = new int[numberOfNodes];
        Arrays.fill(colors, WHITE);
        for(int node = 0; node < numberOfNodes; node++){
            if(colors[node] != WHITE) continue;
        boolean containsCycle = traverseAndColorNodes(node, edges, colors);
        if(containsCycle) return true;
        }
        return false;
    }

    public static boolean traverseAndColorNodes(int node, int[][] edges, int colors[]){
        colors[node] = GREY;
        int [] neighbors = edges[node];
        for(int neighbor : neighbors){
            int neighborColor = colors[neighbor];
            if(neighborColor == GREY) return true;
            if(neighborColor == BLACK) continue;
            boolean containsCycle = traverseAndColorNodes(neighbor, edges, colors);
            if(containsCycle) return true;
        }
        colors[node] = BLACK;
        return false;
    }

    public static void main(String[] args) {

        int [][] edges = {{1,3}, {2,3,4}, {0}, {}, {2,5}, {}};
        System.out.println("Is there a cycle in the graph? : " + cycleInGraph(edges));
        System.out.println("Is there a cycle in the graph? : " + isGraphCycle(edges));
    }
}
