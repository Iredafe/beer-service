package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuSolver {

    int rowSize = 9;
    int rows[][] = new int [rowSize][rowSize+1];
    int columns[][] = new int[rowSize][rowSize+1];
    int boxes [][] = new int[rowSize][rowSize+1];
    char[][] board;
    boolean sudokuSolved = false;

    public boolean couldPlace(int number , int i, int j){
        int index = (i/3) * 3 + j/3;

        return rows[i][number] + columns[i][number] + boxes[index][number]==0;
    }

    public void backtrack(int i, int j){
        if(board[i][j] == '.'){
            for(int number = 1; number < 10; number++){
                if(couldPlace(number, i, j)){
                    placeNumber(number, i, j);
                    placeNextNumber(i, j);
                }
            }
        }
    }

    private void placeNextNumber(int i, int j) {
    }

    private void placeNumber(int number, int i, int j) {
    }

    public void solveSudoku(char[][] board) {

    }
        /* another approach */
public static boolean sudokuSolver(ArrayList<ArrayList<Integer>> sudoku){
    return solvePartialSudoku(sudoku, 0, 0);
}

    private static boolean solvePartialSudoku(ArrayList<ArrayList<Integer>> sudoku, int row, int col) {
        int currentRow = row;
        int currentCol = col;

        if(currentCol == sudoku.size())
        {
            currentRow += 1;
            currentCol = 0;

            if(currentRow == sudoku.get(col).size()){
                return true; // board completed
            }
            if(sudoku.get(currentRow).get(currentCol).equals(0)){
                tryDigitsAtPosition(sudoku, currentRow, currentCol);
            }
        }
    return solvePartialSudoku(sudoku, currentRow, currentCol+1);
    }

    public static boolean tryDigitsAtPosition(ArrayList<ArrayList<Integer>> sudoku, int row, int col){

    return true;
    }
    public static void main(String[] args) {

        char[][] board ={{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        ArrayList<ArrayList<Integer>> sudoku = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(7, 8, 0, 4, 0, 0, 1, 2, 0)),
                new ArrayList<>(Arrays.asList(6, 0, 0, 0, 7, 5, 0, 0, 9)),
                new ArrayList<>(Arrays.asList(0, 0, 0, 6, 0, 1, 0, 7, 8)),
                new ArrayList<>(Arrays.asList(0, 0, 7, 0, 4, 0, 2, 6, 0)),
                new ArrayList<>(Arrays.asList(0, 0, 1, 0, 5, 0, 9, 3, 0)),
                new ArrayList<>(Arrays.asList(9, 0, 4, 0, 6, 0, 0, 0, 5)),
                new ArrayList<>(Arrays.asList(0, 7, 0, 3, 0, 0, 0, 1, 2)),
                new ArrayList<>(Arrays.asList(1, 2, 0, 0, 0, 7, 4, 0, 0)),
                new ArrayList<>(Arrays.asList(0, 4, 9, 2, 0, 6, 0, 0, 7))
        ));

                }
}
