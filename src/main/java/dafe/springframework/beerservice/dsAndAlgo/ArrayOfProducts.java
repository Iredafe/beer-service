package dafe.springframework.beerservice.dsAndAlgo;

public class ArrayOfProducts {

    public static int[] arrayOfProducts(int [] array){

        return new int[]{};
    }

    public static void main(String[] args) {

        int [] input = {5, 1, 4, 2}; //1,2,4,5
                                    //10,20,40,8
        System.out.println("This is the result of array of products : " + arrayOfProducts(input));
    }
}
