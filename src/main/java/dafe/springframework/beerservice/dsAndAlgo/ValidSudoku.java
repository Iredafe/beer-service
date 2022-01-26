package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashSet;

public class ValidSudoku {

    public static boolean validSudoku(char[][] sudoku) {
        int length = 9;

        HashSet<Character>[] row = new HashSet[length];
        HashSet<Character>[] col = new HashSet[length];
        HashSet<Character>[] box = new HashSet[length];
            for(int r=0; r <length; r++){
                row[r] = new HashSet<>();
                col[r] = new HashSet<>();
                box[r] = new HashSet<>();
            }
            for(int i=0; i<length; i++){
                for(int j=0; j< length; j++){
                    char value = sudoku[i][j];

                    if(row[i].contains(value)){
                        return false;
                    }
                    row[i].add(value);
                    if(col[j].contains(value)){
                        return false;
                    }
                    col[j].add(value);

                    int position = (i/3) * 3 + j/3;
                    if(box[position].contains(value)){
                        return false;
                    }
                    box[position].add(value);
                }
            }

        return true;
    }

    public static void main(String[] args) {

        char[][] sudoku = {{'5' , '3' , '.' , '.' , '7' , '.' , '.' , '.' , '.'}
                , {'6' , '.' , '.' , '1' , '9' , '5' , '.' , '.' , '.'}
                , {'.' , '9' , '8' , '.' , '.' , '.' , '.' , '6' , '.'}
                , {'8' , '.' , '.' , '.' , '6' , '.' , '.' , '.' , '3'}
                , {'4' , '.' , '.' , '8' , '.' , '3' , '.' , '.' , '1'}
                , {'7' , '.' , '.' , '.' , '2' , '.' , '.' , '.' , '6'}
                , {'.' , '6' , '.' , '.' , '.' , '.' , '2' , '8' , '.'}
                , {'.' , '.' , '.' , '4' , '1' , '9' , '.' , '.' , '5'}
                , {'.' , '.' , '.' , '.' , '8' , '.' , '.' , '7' , '9'}};

        System.out.println("Is this a valid sudoku ? "  + validSudoku(sudoku));
    }
}