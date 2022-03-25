package dafe.springframework.beerservice.dsAndAlgo;

public class SerializeAndDeserializeBinaryTree {

    private TreeNode root;

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
        public static String serialize(TreeNode root){

            return serializer(root,"");
        }

        public static String serializer(TreeNode root, String str){

            if(root == null){
                str+="null, ";
            }else{
                str+=str.valueOf(root.val + "");
                str+= serializer(root.left , str);
                str+= serializer(root.right, str);
            }
            return str;
        }


    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree tree = new SerializeAndDeserializeBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(4);
        tree.root.right.right = new TreeNode(5);
    }
}
