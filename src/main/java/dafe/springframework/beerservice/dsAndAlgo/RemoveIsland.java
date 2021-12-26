package dafe.springframework.beerservice.dsAndAlgo;

public class RemoveIsland {

    static int [][] removeIslands(int [][] matrix){

        return matrix;
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
