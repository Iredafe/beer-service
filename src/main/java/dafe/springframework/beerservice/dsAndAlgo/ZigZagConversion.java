package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

    public static String convert(String zigzag, int numberOfRows){
    if(numberOfRows == 1) return zigzag;

    List <StringBuilder> rows = new ArrayList<>();
    for(int i=0; i< Math.min(numberOfRows, zigzag.length()); i++)
        rows.add(new StringBuilder());

    int currentRow = 0;
    boolean isGoingDown = false;
    for(char c: zigzag.toCharArray()){
        rows.get(currentRow).append(c);
        if(currentRow == 0 || currentRow == numberOfRows-1) isGoingDown = !isGoingDown;
        currentRow += isGoingDown ? 1 : -1;
    }

    StringBuilder returnStatement = new StringBuilder();
    for (StringBuilder row : rows){
        returnStatement.append(row);
        }
        return returnStatement.toString();

    }


    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        int rowsOfInput = 3;

        System.out.println("This is the converted result : " + convert(input, rowsOfInput));
    }
}
