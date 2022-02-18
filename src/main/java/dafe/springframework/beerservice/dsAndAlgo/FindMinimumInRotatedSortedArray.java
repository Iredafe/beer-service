package dafe.springframework.beerservice.dsAndAlgo;

public class FindMinimumInRotatedSortedArray {

    public static int findMinimum(int [] array){
        int left = 0; int right = array.length-1; int number=array[left];

        while (left<= right){
            int mid = (left+right)/2;
            if(array[mid] < number){
                number=array[mid];
                right=mid-1;
            }else{
                left = mid+1;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        int [] nums ={3,4,5,1,2};
        System.out.println("This is the minimum number is : " + findMinimum(nums));
    }
}
