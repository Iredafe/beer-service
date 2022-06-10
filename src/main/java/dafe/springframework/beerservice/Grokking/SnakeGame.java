package dafe.springframework.beerservice.Grokking;

import org.springframework.data.util.Pair;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class SnakeGame {
    int score=0;
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
        snakeMap.put(Pair.of(0,0), true);
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

        boolean crossBoundary1 = newHeadRow < 0 || newHeadRow >= height;
        boolean crossBoundary2 = newHeadCol < 0 || newHeadCol >= width;

        boolean bitesItself = snakeMap.containsKey(newHead) &&
                !(newHead.getFirst()== currentTail.getFirst()
                && newHead.getSecond()==currentTail.getSecond());

        if(crossBoundary1 || crossBoundary2 || bitesItself) {
            score= -1;
            return score;
        }

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
        score=snake.size()-1;
        return score;
    }

    //if there is available food and if it is on the cell occupied by
    public static void main(String[] args) {
        SnakeGame snakeGame = new SnakeGame(3, 2, new int[][]{{1, 2}, {0, 1}});
        snakeGame.move("R"); // return 0
        snakeGame.move("D"); // return 0
        snakeGame.move("R"); // return 1, snake eats the first piece of food. The second piece of food appears at (0, 1).
        snakeGame.move("U"); // return 1
        snakeGame.move("L"); // return 2, snake eats the second food. No more food appears.
        snakeGame.move("U");


        System.out.println("This is the score from snake game : " + snakeGame.score);
    }
}
