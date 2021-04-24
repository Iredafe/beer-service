package dafe.springframework.beerservice;

class VersionControl{
    static boolean isBadVersion(int version){
        version=2;
        return  true;
    }
}

public class Solution14 extends VersionControl {
    public static int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {

        int target = 9;
        int[] nums = new int[]{3, 2, 1, 4, 7, 9, 8, 15, 34, 6, 0};
        System.out.println("This is the index of the searched item : " + firstBadVersion(9));
    }

}


