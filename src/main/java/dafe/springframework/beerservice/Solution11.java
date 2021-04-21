package dafe.springframework.beerservice;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution11 {

        public static TreeNode sortedArrayToBST(int[] nums) {
            return convertToBinarySearchTree(nums, 0, nums.length-1);

        }

        public static TreeNode convertToBinarySearchTree(int[] nums, int start, int end){
            if(start>end){
                return null;
            }

            int mid =(start+end)/2;
            TreeNode tNode = new TreeNode(nums[mid], null, null);
            tNode.left = convertToBinarySearchTree(nums, start, mid-1);
            tNode.right = convertToBinarySearchTree(nums, mid+1, end);

            return tNode;
        }


    public static void main(String[] args) {
        int [] mySortedArray = {2,4,3,7,4,10,23,15};

        System.out.println("This is the array before converion : " + mySortedArray);
        System.out.println("This is the converted array : " + sortedArrayToBST(mySortedArray));


    }

    }
