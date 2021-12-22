package dafe.springframework.beerservice.dsAndAlgo;

public class BSTConstruction {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            BST currentNode = this;
            while (true) {
                if (value < currentNode.value) {
                    if (currentNode.left == null) {
                        BST newNode = new BST(value);
                        currentNode.left = newNode;
                        break;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else {
                    if (currentNode.right == null) {
                        BST newNode = new BST(value);
                        currentNode.right = newNode;
                        break;
                    } else {
                        currentNode = currentNode.right;
                    }
                }
            }
            return this;
        }

        public boolean contains(int value) {
            BST currentNode = this;
            while (currentNode != null) {
                if (value < currentNode.value) {
                    currentNode = currentNode.left;
                } else if (value > currentNode.value) {
                    currentNode = currentNode.right;
                } else {
                    return true;
                }
            }
            return false;
        }

        public void remove(int value, BST parentNode){
            BST currentNode = this;
            while(currentNode!=null){
                if(value < currentNode.value){
                    parentNode=currentNode;
                    currentNode = currentNode.left;
                }else if(value > currentNode.value){
                    parentNode=currentNode;
                    currentNode=currentNode.right;
                }else {
                    if(currentNode.left != null && currentNode.right != null){
                        currentNode.value = currentNode.right.getMinValue();
                        currentNode.right.remove(currentNode.value, currentNode);
                    }
                }
            }
        }
        public int getMinValue(){
        if(left==null) {
            return value;
        }
        else {
            return left.getMinValue();
        }
        }
    }
}