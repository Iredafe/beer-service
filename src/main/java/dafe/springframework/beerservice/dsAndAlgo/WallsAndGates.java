package dafe.springframework.beerservice.dsAndAlgo;

import java.io.FilterOutputStream;

public class WallsAndGates {

    public static int[][] wallsAndGates(int [][] room){
        for(int i=0; i< room.length; i++){
            for(int j=0; i<room[0].length; i++){
                if(room[i][j] == 0){
                    dfs(room, i, j, count);
                }
            }
        }
        return room;
    }


    public static void main(String[] args) {
        int [][] input = {{2147483647,-1,0,2147483647},
                        {2147483647,2147483647,2147483647,-1},
                        {2147483647,-1,2147483647,-1},
                        {0,-1,2147483647,2147483647}};

        System.out.println("This are the number of steps to reach the gate : " + wallsAndGates(input));
    }
}
