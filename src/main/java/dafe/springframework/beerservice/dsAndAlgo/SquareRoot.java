package dafe.springframework.beerservice.dsAndAlgo;

public class SquareRoot {

    public static int squareRoot(int number){
        int left = 1; int right = number; int result = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(mid*mid <= number){
                result = mid;
                left = mid+1;
            }else if(mid*mid > number){
                right = mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int input = 8;
        System.out.println("This is the square root : " + squareRoot(input));
    }

}
