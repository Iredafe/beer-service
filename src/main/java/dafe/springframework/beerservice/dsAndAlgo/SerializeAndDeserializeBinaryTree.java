package dafe.springframework.beerservice.dsAndAlgo;

public class SerializeAndDeserializeBinaryTree {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }

        public static String serialize(TreeNode root){

            return "";
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
    }
}
