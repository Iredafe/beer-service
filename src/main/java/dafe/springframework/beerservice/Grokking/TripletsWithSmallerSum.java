package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;

public class TripletsWithSmallerSum {

    private static int searchTriplets(int [] array, int target){
        Arrays.sort(array);
        int count=0;
        for(int index=0; index<array.length-2; index++){
            int left=index+1; int right=array.length-1;

            while (left<right){
                int sum = array[left]+ array[right] + array[index];
                if(sum < target){
                    count+=right-left;
                    left++;

                }else{
                    right--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(searchTriplets(new int[] { -1, 0, 2, 3 }, 3));
        System.out.println(searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
        System.out.println(searchTriplets(new int[] {3,1,0,-2}, 4));
    }
}
