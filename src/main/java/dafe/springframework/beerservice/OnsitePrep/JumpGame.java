package dafe.springframework.beerservice.OnsitePrep;

public class JumpGame {

    public static boolean canJump(int nums []){
       return canJumpFromPosition(nums, 0);
    }

    public static boolean canJumpFromPosition(int nums[], int position){

        return false;
    }

    public static void main(String[] args) {
        int [] array = {2,3,1,1,4};

        System.out.println("Can I jump to the end of the array? " +canJump(array));
    }
}
