package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashSet;

public class WordSearch {

//loop through the board
//check each position to see if the letter exists.
// if it does not exists, return flase
//else return true after traversing the board

    public static boolean exist(char[][] board, String word) {

            for(int i = 0; i<board.length; i++){
                for(int j=0; j<board[i].length;j++){
                    char value = board[i][j];
                    if(word.charAt(0) == value && dfs(board, i, j, word, 0)) {
                        return true;
                    }
            }
        }
            return false;
    }



    public static void main(String[] args) {
        char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";

        System.out.println(" This word can be found in the board : " + exist(board, word));
    }
    }
