package dafe.springframework.beerservice.dsAndAlgo;

public class CountUnivalueSubtrees {

    static int count=0;
    private Tree root;

    static class Tree{
        int val;
        Tree left;
        Tree right;

        public Tree(int val){
            this.val = val;
        }
    }

    private static int countUniValueSubtrees(Tree root) {

        return 0;
    }

    private static boolean isUnivalueSubtree(Tree root){
       if(root.left == null && root.right == null) return true;
       count++;
       boolean isUnivalue = true;

       if(root.left != null){
           isUnivalue = isUnivalueSubtree(root.left) && isUnivalue && root.left.val == root.val;

       }
       if(root.right != null){
           isUnivalue = isUnivalueSubtree(root.right) && isUnivalue && root.right.val == root.val;
       }

       if(!isUnivalue) return false;
       count++;
       return true;

    }


    public static void main(String[] args){

        CountUnivalueSubtrees tree = new CountUnivalueSubtrees();
        tree.root = new Tree(5);
        tree.root.left = new Tree(1);
        tree.root.right = new Tree(5);
        tree.root.left.left = new Tree(5);
        tree.root.left.right = new Tree(5);
        tree.root.right.right = new Tree(5);


        System.out.println("This is the number of univalue trees : " + countUniValueSubtrees(tree.root));
    }

}
