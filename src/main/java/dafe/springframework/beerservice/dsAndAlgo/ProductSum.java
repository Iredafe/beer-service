package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {

    public static int productSum(List<Object> array){

        productSumHelper( array, 1);

        return 1;
    }

   public static int productSumHelper(List<Object> array, int multiplier){
        int sum = 0;
        for(Object element : array){
            if(element instanceof ArrayList){
                ArrayList<Object> list = (ArrayList<Object>) element;
                sum += productSumHelper(list, multiplier+1);
            }else{
                sum+=(int)element;
            }
        }
        return sum*multiplier;
   }

    public static void main(String[] args) {

//        System.out.println("This is the product sum of the array : " + productSum(input));
    }
}
