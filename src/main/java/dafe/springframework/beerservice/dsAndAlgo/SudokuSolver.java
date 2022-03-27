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


    public static void solveSudoku(char[][]board){
        solveSudokuPartially(board,0,0);
        return;
    }

    public static void solveSudokuPartially(char[][]board, int row, int col){
        int currentRow = row;
        int currentCol = col;

        if(currentCol == board[currentRow].length){
            currentRow+=1;
            currentCol=0;

            if(currentRow == board.length){
                return; //board completed
            }
        }

        if(board[currentRow][currentCol]=='.'){
            testDigitsAtPosition(board, currentRow, currentCol);
            return;
        }
    }

    private static void testDigitsAtPosition(char[][] board, int row, int col) {

        for(int digit=0; digit<10; digit++){
            if(isDigitValidAtPosition(board, digit, row, col)){
                board[row][col] = (char) digit;
                solveSudokuPartially(board, row, col+1);
                return;
            }
            board[row][col] = '.';
        }
    }

    private static boolean isDigitValidAtPosition(char[][] board, int value, int row, int col) {
        return false;
    }

    /* another approach */
public static ArrayList<ArrayList<Integer>> sudokuSolver(ArrayList<ArrayList<Integer>> sudoku){
    solvePartialSudoku(sudoku, 0, 0);
    return sudoku;
}

    private static boolean solvePartialSudoku(ArrayList<ArrayList<Integer>> sudoku, int row, int col) {
        int currentRow = row;
        int currentCol = col;

        if(currentCol == sudoku.get(currentRow).size())
        {
            currentRow += 1;
            currentCol = 0;

            if(currentRow == sudoku.size()){
                return true; // board completed
            }
        }
        if(sudoku.get(currentRow).get(currentCol)== 0){
           return tryDigitsAtPosition(sudoku, currentRow, currentCol);
        }
    return solvePartialSudoku(sudoku, currentRow, currentCol+1);
    }

    public static boolean tryDigitsAtPosition(ArrayList<ArrayList<Integer>> sudoku, int row, int col){

    for(int digit=1; digit<10; digit++){
        if(isValidAtPosition(sudoku, digit, row, col)){
            sudoku.get(row).set(col, digit);
            if(solvePartialSudoku(sudoku, row, col+1)){
                return true;
            }
        }
    }
        sudoku.get(row).set(col, 0);
        return false;
    }

    public static boolean isValidAtPosition(ArrayList<ArrayList<Integer>> sudoku, int value, int row, int col){

    boolean rowIsValid = !sudoku.get(row).contains(value);
    boolean colIsValid = true;

    for(int r=0; r<sudoku.size(); r++){
        if(sudoku.get(r).get(col) == value) colIsValid = false;
    }

    if(!rowIsValid || !colIsValid){
        return false;
    }

        int subGridRowStart = (row/3)*3;
        int subGridColStart = (col/3)*3;

        for(int rowIdx = 0; rowIdx<3; rowIdx++){
            for(int colIdx =0; colIdx<3; colIdx++){
                int rowToCheck = subGridRowStart + rowIdx;
                int colToCheck = subGridColStart + colIdx;
                int existingValue = sudoku.get(rowToCheck).get(colToCheck);
                if(existingValue == value) return false;
            }
        }
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

        System.out.println("This is the solved sudoku " + sudokuSolver(sudoku));

    }
}
