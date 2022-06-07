package dafe.springframework.beerservice.Grokking;

import org.springframework.data.util.Pair;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class SnakeGame {
    int[][]food;
    int width;
    int height;
    int foodIndex;
    HashMap<Pair<Integer, Integer>, Integer> snakeMap;
    Deque<Pair<Integer,Integer>> snake;

    public SnakeGame(int width, int height, int[][] food){
        this.width = width;
        this.height=height;
        this.food=food;
        snakeMap = new HashMap<>();
        snake = new LinkedList<>();
    }

    public int move(String direction){

        return -1;
    }

    public static void main(String[] args) {

    }
}
