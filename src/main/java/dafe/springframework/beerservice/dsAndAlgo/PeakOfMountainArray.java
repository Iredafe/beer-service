package dafe.springframework.beerservice.dsAndAlgo;

public class PeakOfMountainArray {

    public static int peak(int [] arr){
        int result = -1;
        int left = 0; int right = arr.length-1;
        while(left<=right){
    int mid = (left+right)/2;
    if(arr[mid] < arr[mid+1]){
        left = mid +1;
    }else {
        result=mid;
        right = mid-1;
    }
        }
        return result;
    }
    public static void main(String[] args) {

        int [] nums = {0, 1, 2, 3, 2, 1, 0};
        System.out.println("The peak is : " + peak(nums));
    }
}
