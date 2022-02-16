package dafe.springframework.beerservice.dsAndAlgo;

public class FirstOccurence {

    public static int firstOccurence(int [] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int index = -1;

        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                index = mid;
                right = mid -1;
            }else if(arr[mid] < target) {
                left = mid + 1;
            }else{
                right = mid-1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int [] arr ={1, 3, 3, 3, 3, 6, 10, 10, 10, 100};
        int [] arr1 ={4, 6, 7, 7, 7, 20};
        int target = 3;
        int target1 = 8;


        //System.out.println("This is the first occurrence : " + firstOccurence(arr, target));
        System.out.println("This is the first occurrence1 : " + firstOccurence(arr1, target1));
    }
}
