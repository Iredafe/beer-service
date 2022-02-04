package dafe.springframework.beerservice.dsAndAlgo;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {

    public static int[][] wallsAndGates(int [][] room){
        for(int i=0; i< room.length; i++){
            for(int j=0; j <room[0].length; j++){
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
        if(rooms.length == 0) return new int[][]{};
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<rooms.length; i++){
            for(int j=0; j< rooms[i].length; j++){
                if(rooms[i][j] ==0){
                    queue.add(new int[]{i,j});
                }
            }
        }
            int[][] directions = new int[][]{{1,0}, {0, -1}, {0, 1}, {-1, 0}};
        while(queue.size() !=0){
                int [] current = queue.poll();
                int row = current[0];
                int col = current[1];

                for(int [] direction : directions){
                    int r = direction[0] + row;
                    int c = direction[1] + col;
                    if(r < 0 || c < 0 || r >= rooms.length || c >= rooms[0].length || rooms[r][c] != Integer.MAX_VALUE){
                        continue;
                    }
                    rooms[r][c] = rooms[row][col] + 1;
                    queue.add(new int[]{r,c});
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
        System.out.println("This are the number of steps to reach the gate : " + Arrays.deepToString(wallsAndGatesBFS(input)));
    }
}
