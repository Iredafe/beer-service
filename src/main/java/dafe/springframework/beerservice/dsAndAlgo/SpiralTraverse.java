package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

    public static List<Integer> spiralTraverse(int[][] array){
        if(array.length==0) return new ArrayList<Integer>();

        var result = new ArrayList<Integer>();
        var startRow = 0; var startColumn=0; var endRow= array.length-1; var endColumn = array[0].length-1;

        while (startRow <= endRow  && startColumn <= endColumn){
            for (int column=startColumn; column<=endColumn; column++){
                result.add(array[startColumn][column]);
            }
            for(int row=startRow+1; row<=endRow; row++){
                result.add(array[row][endRow]);
            }
            for(int column=endColumn-1; column>=startColumn; column--){
                if(startRow == endRow) break;
                result.add(array[endRow][column]);
            }
            for (int row=endRow-1; row>startRow; row--){
                if(startColumn==endColumn) break;;
                result.add(array[row][startColumn]);
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
        return result;
    }


    public static void main(String[] args) {
        int [][] input = {{1, 2, 3, 4},
        {12, 13, 14, 5},
        {11, 16, 15, 6},
        {10, 9, 8, 7}};

        System.out.println("This is the result of spiral traverse : " + spiralTraverse(input));
    }
}
