package dafe.springframework.beerservice.dsAndAlgo;

public class YoungestCommonAncestor {

    static BinaryTree root;
    static class BinaryTree{
        public char name;
        public BinaryTree ancestor;

        public BinaryTree(char name){
            this.name = name;
            this.ancestor = null;
        }

    }

    public static BinaryTree getYoungestCommonAncestor(BinaryTree topAncestor, BinaryTree descendantOne, BinaryTree descendantTwo){

        int depthOne = getDescendant(descendantOne, topAncestor);
        int depthTwo = getDescendant(descendantTwo, topAncestor);

        if(depthOne > depthTwo){
            return backtrackAncestralTree(descendantOne, descendantTwo, depthOne-depthTwo);
        }else{
            return backtrackAncestralTree(descendantTwo, descendantTwo, depthTwo-depthOne);
        }
    }

    public static int getDescendant(BinaryTree descendant, BinaryTree topAncestor){
        int depth = 0;
        while (descendant!=topAncestor){
            depth++;
            descendant=descendant.ancestor;
        }
        return depth;
    }

    public static BinaryTree backtrackAncestralTree(BinaryTree lowerDescendant, BinaryTree higherDescendant, int diff){
        while (diff>0){
            lowerDescendant = lowerDescendant.ancestor;
            diff--;
        }
        while (lowerDescendant!=higherDescendant){
            lowerDescendant=lowerDescendant.ancestor;
            higherDescendant=higherDescendant.ancestor;
        }
        return lowerDescendant;
    }


    public static void main(String[] args) {

        YoungestCommonAncestor tree = new YoungestCommonAncestor();
        tree.root = new BinaryTree('A');
        tree.root.ancestor = new BinaryTree('B');
        tree.root = new BinaryTree('A');
        tree.root = new BinaryTree('A');
        tree.root = new BinaryTree('A');
        tree.root = new BinaryTree('A');
        tree.root = new BinaryTree('A');
        tree.root = new BinaryTree('A');
    }
}
