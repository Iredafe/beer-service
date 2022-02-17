package dafe.springframework.beerservice.dsAndAlgo;

public class FindMinimumInRotatedSortedArray {

    public static int findMinimum(int [] array){
        int left = 0; int right = array.length-1; int index=-1;

        while (left<= right){
            int mid = (left+right)/2;
            if(array[mid] >= array[right]){
                index=mid;
                left = mid+1;
            }else{
                right=mid-1;
            }
        }

        return index;
    }


    public static void main(String[] args) {
        int [] nums ={3, 5, 7, 11, 13, 17, 19, 2};
        System.out.println("This is the minimum number's index : " + findMinimum(nums));
    }
}
