package dafe.springframework.beerservice.Grokking;

public class TripletsWithSmallerSum {

    private static int searchTriplets(int [] array, int target){

        for(int index=0; index<array.length; index++){
            int left=index+1; int right=array.length-1;

            while (left<right){

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(searchTriplets(new int[] { -1, 0, 2, 3 }, 3));
        System.out.println(searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
    }
}
