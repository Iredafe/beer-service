package dafe.springframework.beerservice.dsAndAlgo;

public class FindingBoundaries {

    public static int findBoundary(boolean[] array){
        int left = 0;
        int right = array.length-1;
        int boundaryIndex = -1;
        while(left<=right){
            int mid = (left+right)/2;
        if(array[mid] == true){
            boundaryIndex = mid;
            right = mid-1;
        }else if(array[mid] == false){
            left = mid+1;
        }
        }
        return boundaryIndex;
    }

    public static void main(String[] args) {
        boolean [] arr = {false,false, false, false, true, true, true};
        System.out.println("This is the boundary : " + findBoundary(arr));
    }
}
