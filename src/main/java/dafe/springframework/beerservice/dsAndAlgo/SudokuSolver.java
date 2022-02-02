package dafe.springframework.beerservice.dsAndAlgo;

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

    public void solveSudoku(char[][] board) {

    }

    public static void main(String[] args) {

    }
}
