package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;

public class Karat1FindRectangle {

    private static int[] findRectangle(int[][] image) {

        for(int row=0; row<image.length; row++){
            for(int col=0; col<image[row].length; col++){
                if(image[row][col] == 0){
                    return new int[]{row,col};
                }
            }
        }
            return new int[]{};
    }

    public static void main(String[] args) {
        int [][] image=new int[][] {{1,1,1,1,1,1,1},
                                    {1,1,1,1,1,1,1},
                                    {1,1,1,0,0,0,1},
                                    {1,1,1,0,0,0,1},
                                    {1,1,1,1,1,1,1}};

        System.out.println("Find rectangle index : " + Arrays.toString(findRectangle(image)));
    }

}
