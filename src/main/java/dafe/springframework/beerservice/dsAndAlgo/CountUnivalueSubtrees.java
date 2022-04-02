package dafe.springframework.beerservice.dsAndAlgo;

public class CountUnivalueSubtrees {

    private Tree root;

    static class Tree{
        int val;
        Tree left;
        Tree right;

        public Tree(int val){
            this.val = val;
        }
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
