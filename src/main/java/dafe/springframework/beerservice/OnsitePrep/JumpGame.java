package dafe.springframework.beerservice.OnsitePrep;

public class JumpGame {

    public static boolean canJump(int nums []){
        canJumpFromPosition(nums, 0);
    }

    public static void main(String[] args) {
        int [] array = {2,3,1,1,4};

        System.out.println("Can I jump to the end of the array? " +canJump(array));
    }
}
