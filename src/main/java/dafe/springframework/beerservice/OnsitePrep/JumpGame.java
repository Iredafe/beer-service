package dafe.springframework.beerservice.OnsitePrep;

public class JumpGame {

    public static boolean canJump(int nums []){
       return canJumpFromPosition(nums, 0);
    }

    public static boolean canJumpFromPosition(int nums[], int position){
        if(position == nums.length-1){
            return true;
        }

        int furthestPosition = Math.min((position+nums[position]), nums.length);
        for(int nextPosition=position+1; nextPosition<=furthestPosition; nextPosition++){
            if(canJumpFromPosition(nums, nextPosition)){
                return true;
            }
        }
        return false;
    }
 enum Index{
        GOOD, BAD, UNKNOWN
 }
    static Index [] memo;
 public static boolean jumpGameHelper(int position, int [] nums){

        if(memo[position] != Index.UNKNOWN){
            return memo[position] == Index.GOOD;
        }
        int furthestPosition = Math.min(position+nums[position] , nums.length-1);
        for(int nextPosition = 0; nextPosition<=furthestPosition; nextPosition++){
            if(jumpGameHelper(nextPosition, nums)){
                memo[position] = Index.GOOD;
                return true;
            }
        }
        memo[position] = Index.BAD;
        return false;
 }

 public static boolean jumpGame(int [] nums){
     Index[] memo = new Index[nums.length];

     for(int i=0;i< memo.length; i++){
         memo[i] = Index.UNKNOWN;
     }
 }
    public static void main(String[] args) {
        int [] array = {2,3,1,1,4};
        int [] array1 = {3,2,1,0,4};

        System.out.println("Can I jump to the end of the array? " +canJump(array));
        System.out.println("Can I jump to the end of the array2 ? " +canJump(array1));
    }
}
