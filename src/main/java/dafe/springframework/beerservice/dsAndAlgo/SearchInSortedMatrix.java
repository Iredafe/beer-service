package dafe.springframework.beerservice.dsAndAlgo;

public class SearchInSortedMatrix {

    public static int[] searchSortedMatrix(int[][] array, int target){


        return new int[]{-1,-1};
    }



    public static void main(String[] args) {
        int target=44;
        int[][] matrix = {
                {1, 4, 7, 12, 15, 1000},
                {2, 5, 19, 31, 32, 1001},
                {3, 8, 24, 33, 35, 1002},
                {40, 41, 42, 44, 45, 1003},
                {99, 100, 103, 106, 128, 1004}
        };

        int [] result = searchSortedMatrix(matrix,target);
        System.out.println("This  is the position of the target : " + result);

    }
}