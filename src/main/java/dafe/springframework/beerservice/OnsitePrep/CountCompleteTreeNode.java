package dafe.springframework.beerservice.OnsitePrep;

public class CountCompleteTreeNode {
    static BinaryTree root;
    static class BinaryTree{
        int value; BinaryTree left; BinaryTree right;

        public BinaryTree(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CountCompleteTreeNode tree = new CountCompleteTreeNode();
    }

}
