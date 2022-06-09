package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;

public class Karat2 {

    /*

Our user research team has discovered that two-dimensional games are all the rage; it's time to upgrade!

New board constraints:
 - The board is a two-dimensional grid of characters
 - An empty space on the board is denoted by a dash '-'
 - The player is denoted by the letter 'P'
 - Monsters are denoted by the letter 'M'

Write a function that takes a two-dimensional board, and returns the location of the player.

For the location you can define whatever coordinate system works for you. A standard approach is to define the top-left corner of the board as (0,0), and give coordinates in (row,column) order.

Example:
board1 = [
  ['-', '-', '-', '-', '-', '-'],
  ['-', '-', 'M', '-', 'M', '-'],
  ['-', '-', '-', 'P', '-', '-'],
  ['M', '-', '-', 'M', '-', '-'],
  ['-', 'M', '-', '-', '-', '-'],
]
Expected output (in any format):
2,3

Complexity Analysis variables:
n = number of rows
m = number of columns

time: O(mn)
space: O(1)

*/

//test cases


//solution plan
//iterate over the input array
//do a lookup on each index to fin the 'P' - player
//if I find the 'P', return the index of that character





        // private static int playerPosition(char [] board){

        //   int result=0;

        //   for(char characterIndex = 0; characterIndex < board.length; characterIndex++){

        //     if(board[characterIndex] == 'P'){
        //       return characterIndex;
        //     }
        //   }

        //   return result;
        // }


        private static int distance(char [] board){
            int result=0;
            int leftPointer=0;

            for(int rightPointer=0; rightPointer<board.length; rightPointer++){
                if(board[rightPointer] == 'M' || board[rightPointer]=='P'){
                    leftPointer = rightPointer;
                    break;
                }
            }

            for(int rightPointer=leftPointer+1; rightPointer<board.length; rightPointer++){
                if(board[rightPointer] == 'M' || board[rightPointer]=='P'){
                    result = rightPointer-leftPointer - 1;
                    break;
                }
            }
            return result;
        }

        private static int[] playerPosition(char[][] board){

            int rowLength = board.length;
            int columnLength = board[0].length;

            for(int row=0; row<rowLength; row++){
                for(int column=0; column<columnLength; column++){
                    if(board[row][column] == 'P'){
                        return new int[]{row,column};
                    }
                }
            }

            return new int []{};

        }


        public static void main(String[] argv) {
            char[][] board1 = {
                    {'-', '-', '-', '-', '-', '-'},
                    {'-', '-', 'M', '-', 'M', '-'},
                    {'-', '-', '-', 'P', '-', '-'},
                    {'M', '-', '-', 'M', '-', '-'},
                    {'-', 'M', '-', '-', '-', '-'},
            };
            //   playerPosition(board1); // returns 2,3
            System.out.println(Arrays.toString(playerPosition(board1)));
            char[][] board2 = {
                    {'P', '-', '-', '-', '-', '-'},
                    {'-', '-', 'M', '-', 'M', '-'},
                    {'-', '-', '-', '-', '-', '-'},
                    {'M', '-', '-', 'M', '-', '-'},
                    {'-', 'M', '-', '-', '-', '-'},
            };
//    playerPosition(board2); // returns 0,0
            System.out.println(Arrays.toString(playerPosition(board2)));

            char[][] board3 = {
                    {'M', '-', 'M'},
                    {'M', '-', 'P'},
            };
//    playerPosition(board3); // returns 1,2
            System.out.println(Arrays.toString(playerPosition(board3)));

        }
    }


