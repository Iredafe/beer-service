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
    HashMap<Pair<Integer, Integer>, Boolean> snakeMap;
    Deque<Pair<Integer,Integer>> snake;

    public SnakeGame(int width, int height, int[][] food){
        this.width = width;
        this.height=height;
        this.food=food;
        snakeMap = new HashMap<>();
        snake = new LinkedList<>();
        snake.offerLast(Pair.of(0,0));
    }

    public int move(String direction){
        Pair<Integer, Integer> snakeCell = snake.peekFirst();
        int newHeadRow = snakeCell.getFirst();
        int newHeadCol = snakeCell.getSecond();

        switch (direction){
            case "U": newHeadRow--;
            break;

            case "D": newHeadRow++;
            break;

            case "R": newHeadCol++;
            break;

            case "L": newHeadCol--;
            break;
        }

        Pair<Integer, Integer> newHead = Pair.of(newHeadRow, newHeadCol);
        Pair<Integer, Integer> currentTail = snake.peekLast();

        boolean crossBoundary1 = newHeadRow < 0 || newHeadRow >= width;
        boolean crossBoundary2 = newHeadCol < 0 || newHeadCol >= height;

        boolean bitesItself = snakeMap.containsKey(newHead) &&
                !(newHead.getFirst()== currentTail.getFirst()
                && newHead.getSecond()==currentTail.getSecond());

        if(crossBoundary1 || crossBoundary2 || bitesItself) return -1;

        if(foodIndex < food.length &&
                food[foodIndex][0] == newHeadRow
                && food[foodIndex][1] == newHeadCol){
            foodIndex++;
        }else{
            snake.pollLast();
            snakeMap.remove(currentTail);
        }
        snake.addFirst(newHead);
        snakeMap.put(newHead, true);
        return snake.size()-1;
    }

    //if there is available food and if it is on the cell occupied by
    public static void main(String[] args) {
        SnakeGame snakeGame = new SnakeGame(3, 2, new int[][]{{1, 2}, {0, 1}});

    }
}
