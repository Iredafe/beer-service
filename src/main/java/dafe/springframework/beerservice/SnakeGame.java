package dafe.springframework.beerservice;

import org.springframework.data.util.Pair;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class SnakeGame {
        int [][] food;
        int foodIndex;
         Deque<Pair<Integer, Integer>> snake;
         HashMap<Pair<Integer, Integer>, Boolean> snakeMap;
         int snakeSize;
         int width;
         int height;

        public SnakeGame(int width, int height, int[][]food){
        this.width = width;
        this.height=height;
        this.food = food;
        this.foodIndex=0;
        this.snakeSize=0;
        this.snakeMap = new HashMap<>();
        this.snake = new LinkedList<>();
        snakeMap.put(Pair.of(0,0), true);
        snake.offerLast(Pair.of(0,0));
        }

        public int move(String direction){
            Pair<Integer, Integer> head = snake.peekFirst();
            int newHeadRow = head.getFirst();
            int newHeadColumn = head.getSecond();

            switch (direction){
                case "U" : newHeadRow--;
                break;
                case "D" : newHeadRow++;
                break;
                case "R" : newHeadColumn++;
                break;
                case "L" : newHeadColumn--;
                break;
            }

            Pair<Integer, Integer> newHead = Pair.of(newHeadRow, newHeadColumn);
            Pair<Integer, Integer> currentTail = snake.peekLast();

            boolean hitWall1 = newHeadRow < 0 || newHeadRow >= height;
            boolean hitWall2 = newHeadColumn < 0 || newHeadColumn >= width;
            boolean bitesItself = snakeMap.containsKey(newHead) && !(newHead.getFirst() ==
                    currentTail.getFirst() && newHead.getSecond() == currentTail.getSecond());

            if(hitWall1 || hitWall2 || bitesItself){
                return -1;
            }

            if((foodIndex < food.length) && (food[foodIndex][0] ==
                    newHeadRow) && (food[foodIndex][1]==newHeadColumn)){
                foodIndex++;
            }else{
                snake.removeLast();
                snakeMap.remove(currentTail);
            }

            snake.addFirst(newHead);
            snakeMap.put(newHead, true);
            snakeSize = snake.size()-1;
            return snakeSize;
        }


    public static void main(String[] args) {
        int [][] food = new int[][]{{1, 2}, {0, 1}};
        int width=3, height=2;
        String [] direction0 = {"R","D","R","U","L","U"};

        int [][] food1 = {{0, 1},{1,3}};
        int width1=4, height1=2;
        String [] direction1 = {"R","D","R","R","U"};

        int [][] food2 = {};
        int width2=3, height2=2;
        String [] direction2 = {"R","D","L","U"};

        int [][] food3 = {};
        int width3=3, height3=2;
        String [] direction3 = {"R","D","D"};

          SnakeGame snakeGame0 = new SnakeGame(width,height,food);
          SnakeGame snakeGame1 = new SnakeGame(width1,height1,food1);
          SnakeGame snakeGame2 = new SnakeGame(width2, height2, food2);
          SnakeGame snakeGame3 = new SnakeGame(width3, height3, food3);
        for (String direction : direction0){
            System.out.println("Snake0 moves in correct direction and eats food : " + snakeGame0.move(direction));
        }
        for (String direction : direction1){
            System.out.println("Snake1 moves in correct direction and eats food : " + snakeGame1.move(direction));
        }
        for (String direction : direction2){
            System.out.println("Snake moves in correct direction and eats food : " + snakeGame2.move(direction));
        }
        for (String direction : direction2){
            System.out.println("Snake moves in correct direction and eats food : " + snakeGame2.move(direction));
        }
        for (String direction : direction3){
            System.out.println("Snake moves in correct direction and eats food : " + snakeGame3.move(direction));
        }


        /*

                0,*,0,0
                0,0,0,*
                food[][] = {{0,1},{1,3}}
                width=3
                height=2
                R- food move
                D- no change in size, game is not over
                R- change in position
                R - food move
                U - change position
                length - 2

        0,0,0
        0,0,0 food[][]={}
                width=3
                height=2

        R-moves right
        D- moves down
        L- moves left
        U- moves up back to its starting position


        Acceptance criteria
        -snake moves in 4 directions - up, down, right, left
        -game is over if snake hits wall in any of 4 direction
        -game is over if snake bites itself
        -when snake head is in position of food, the snake should grow by 1 index
        -when snake moves but does not enter food position and does not hit wall,
        the snake should not grow but should change position

        Test cases
       - test that the snake moves correctly in the 4 directions up, down, left, right
       - test that when the snake hits a wall, the game is over (return -1)
       - test that when the snake moves head into food, it grows by 1 index
       -test that when snake bites itself, game is over
       - test that when a snake moves but does not eat food or move into wall,
        it does not grow in length but changes position

       Solution plan
       -create a dynamically resizable structure to hold the snake position
       -the structure should support operations on both ends - deque
       -create a structure to check the current position of the snake - this will help identify when snake bites itself
       -if snake moves into self or hits any wall, return -1
       -if snake eats food, let it grow from head
       -if snake changes position but does not eat food or hit wall, let the entire snake change location and remain same size
       -return the length of the snake
    */
    }
}
