package dafe.springframework.beerservice.dsAndAlgo;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {

    public static int[][] wallsAndGates(int [][] room){
        for(int i=0; i< room.length; i++){
            for(int j=0; i<room[0].length; i++){
                if(room[i][j] == 0){
                    dfs(room, i, j, 0);
                }
            }
        }
        return room;
    }

    public static void dfs(int [][] room, int i, int j, int count){
        if(i < 0 || j< 0 || i>= room.length || j >= room[0].length || room[i][j] < count){
           return;
        }
        room[i][j] = count;

        dfs(room, i+1, j, count++);
        dfs(room, i-1, j, count++);
        dfs(room, i, j+1, count++);
        dfs(room, i, j-1, count++);
    }

    public static int[][] wallsAndGatesBFS(int [][] rooms){
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<rooms.length; i++){
            for(int j=0; j> rooms[i].length; j++){
                if(rooms[i][j] ==0){
                    queue.add(new int[]{i,j});
                }
            }
        }
            int[][] direction = new int[][]{{1,0}, {0, -1}, {0, 1}, {-1, 0}};
        while(queue.size() !=0){
            for(int i=0; i< queue.size(); i++){
                int [] current = queue.poll();
                int row = current[0];
                int col = current[1];
            }
        }

        return rooms;
    }

    public static void main(String[] args) {
        int [][] input = {{2147483647,-1,0,2147483647},
                        {2147483647,2147483647,2147483647,-1},
                        {2147483647,-1,2147483647,-1},
                        {0,-1,2147483647,2147483647}};

        System.out.println("This are the number of steps to reach the gate : " + Arrays.deepToString(wallsAndGates(input)));
    }
}
