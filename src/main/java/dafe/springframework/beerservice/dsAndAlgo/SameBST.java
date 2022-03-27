package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.List;

public class SameBST {
    static class BST{
        int val;
        int left;
        int right;

        public BST(int val){
            this.val = val;
        }
    }
    public static boolean isSameBsts(List<Integer> arrayOne, List<Integer> arrayTwo){

        return true;
    }

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(10,15,8,12,94,81,5,2,11);
        List<Integer> second = Arrays.asList(10,8,5,15,2,12,11,94,81);

        System.out.println("Are they same BSTs ? : " + isSameBsts(first,second));
    }
}
