package dafe.springframework.beerservice.dsAndAlgo;

public class RemoveIsland {

    static int [][] removeIslands(int [][] matrix){
        boolean [][]onesConnectedToBorder = new boolean[matrix.length][matrix[0].length];
        for(int row=0; row < matrix.length; row++) {
            onesConnectedToBorder[row][matrix[row].length-1] = false;
        }

        //find the ones that are not islands

        for(int row = 0; row < matrix.length; row++){
            for(int col=0; col < matrix[row].length; col++){
                //first identify elements at each border
                boolean rowIsBorder = row == 0 || row == matrix.length-1;
                boolean colIsBorder = col == 0 || col == matrix[row].length-1;
                boolean isBorder = rowIsBorder || colIsBorder;
                if(!isBorder) continue;
                //identify the elements that are 1s at the border
                if(matrix[row][col] != 1) continue;
                //update the auxiliary array when we find 1s at the border
           findOnesConnectedToBorder(matrix, row, col, onesConnectedToBorder);
            }
        }
        //  check non-border elements for 1s not connected to border and set to zero - remove the islands
            for(int row=1; row < matrix.length-1; row++){
                for(int col=1; col < matrix[row].length; col++){
                    if(onesConnectedToBorder[row][col]) continue;
                    matrix[row][col] = 0;
                }
            }
        return matrix;
    }


    public  static void findOnesConnectedToBorder(int [][] matrix, int row, int col, boolean [][] onesConnectedToBorder){

    }

    public int[][] getNeighbors(int [][] matrix, int row, int col){

        return new int[][]{};
    }

    public static void main(String[] args) {
        int [][] matrix =           {{1, 0, 0, 0, 0, 0},
                                    {0, 1, 0, 1, 1, 1},
                                    {0, 0, 1, 0, 1, 0},
                                    {1, 1, 0, 0, 1, 0},
                                    {1, 0, 1, 1, 0, 0},
                                    {1, 0, 0, 0, 0, 1}};

        System.out.println("This is the matrix after removing islands : " + removeIslands(matrix));
                            };
}

//create an auxiliary array init to false
//find elements at the border
//find positions of 1 in the matrix