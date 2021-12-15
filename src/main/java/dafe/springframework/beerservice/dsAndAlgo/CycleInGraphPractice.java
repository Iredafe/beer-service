package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class CycleInGraphPractice {

    public static boolean cycleInGraph(int [][]edges){
        //init variables - numberOf nodes
        //create 2 auxiliary arrays - visited & currentlyInstack
        //loop through the graph and check if the nodes are in cycle
        //if they are in cycle return true else return false
        //create the isNodeInCycle function to perform the logic
        //inside this method, check if the nodes are visited, if not visited, visit the node by call the method recursively
        int numberOfNodes = edges.length;
        boolean [] visited = new boolean[numberOfNodes];
        boolean [] currentlyInStack = new boolean[numberOfNodes];
        Arrays.fill(visited, false);
        Arrays.fill(currentlyInStack, false);
        for(int node=0; node < numberOfNodes; node++){
            if(visited[node]){
                continue;
            }
            boolean containsCycle = isNodeInCycle(edges, visited, currentlyInStack, node);
            if(containsCycle){
                return true;
            }
        }
        return false;
    }

    public static boolean isNodeInCycle(int[][] edges, boolean [] visited, boolean[] currentlyInStack, int node){
        boolean containsCycle = false;
        visited[node] = true;
        currentlyInStack[node] = true;
        int [] neighbors = edges[node];
        for(int neighbor : neighbors){
            if(!visited[neighbor]) {
                containsCycle = isNodeInCycle(edges, visited, currentlyInStack, neighbor);
            }
                if (containsCycle) {
                    return true;
                } else if(currentlyInStack[neighbor]){
                return true;
                }
        }
        currentlyInStack [node] = false;
        return false;
    }


    public static void main(String[] args) {

        int [][] edges = {{1,3}, {2,3,4}, {0}, {}, {2,5}, {}};
        System.out.println("Is there a cycle in the graph? : " + cycleInGraph(edges));
    }

}
