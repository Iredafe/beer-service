//package dafe.springframework.beerservice.dsAndAlgo;
//
//public class SudokuSolver {
//
//    int rowSize = 9;
//    int rows[][] = new int [rowSize][rowSize+1];
//    int columns[][] = new int[rowSize][rowSize+1];
//    int boxes [][] = new int[rowSize][rowSize+1];
//    char[][] board;
//    boolean sudokuSolved = false;
//
//    public boolean couldPlace(int number , int i, int j){
//        int index = (i/3) * 3 + j/3;
//
//        return rows[i][number] + columns[i][number] + boxes[index][number]==0;
//    }
//
//    public void backtrack(int i, int j){
//        if(board[i][j] == '.'){
//            for(int number = 1; number < 10; number++){
//                if(couldPlace(number, i, j)){
//                    placeNumber(number, i, j);
//                    placeNextNumber(i, j);
//                }
//            }
//        }
//    }
//
//    private void placeNextNumber(int i, int j) {
//    }
//
//    private void placeNumber(int number, int i, int j) {
//    }
//
//    public void solveSudoku(char[][] board) {
//
//    }
//
//    public static void main(String[] args) {
//
//        char[][] board ={{"5","3",".",".","7",".",".",".","."},
//                {"6",".",".","1","9","5",".",".","."},
//                {".","9","8",".",".",".",".","6","."},
//                {"8",".",".",".","6",".",".",".","3"},
//                {"4",".",".","8",".","3",".",".","1"},
//                {"7",".",".",".","2",".",".",".","6"},
//                {".","6",".",".",".",".","2","8","."},
//                {".",".",".","4","1","9",".",".","5"},
//                {".",".",".",".","8",".",".","7","9"}};
//
//                }
//}
