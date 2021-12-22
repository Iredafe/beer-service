package dafe.springframework.beerservice.dsAndAlgo;

public class BSTConstruction {

    static class BST{
       public int value;
        public BST left;
        public BST right;

        public BST(int value){
            this.value = value;
        }

        public BST insert(int value){
            BST currentNode = this;
           while (true) {
               if (value < currentNode.value) {
                   if (currentNode.left == null) {
                       BST newNode = new BST(value);
                       currentNode.left = newNode;
                   } else {
                       currentNode = currentNode.left;
                   }
               } else {
                       if (currentNode.right == null) {
                           BST newNode = new BST(value);
                           currentNode.right = newNode;
                       } else {
                           currentNode = currentNode.right;
                       }
                   }
               return this;
           }
           }
        }
        public boolean contains(int value){


            return true;
        }
    }


}
