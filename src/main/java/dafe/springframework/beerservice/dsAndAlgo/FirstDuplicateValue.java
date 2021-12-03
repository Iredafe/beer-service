package dafe.springframework.beerservice.dsAndAlgo;

public class FirstDuplicateValue {

    public static int firstDuplicateValue(int[] array) {
        // Write your code here.
        int result = 0;
        for(int i=0; i<array.length; i++){
            for(int j=1; j<array.length; j++){
                if(array[i]==array[j]){
                    result = j;
                    return result;
                }
            }
            result=-1;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] input ={2, 1, 5, 2, 3, 3, 4};

        System.out.println("This is the index of duplicate : " + firstDuplicateValue(input));
    }
}
