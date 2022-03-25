package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
                str+=str.valueOf(root.val + ",");
                str= serializer(root.left , str);
                str= serializer(root.right, str);
            }
            return str;
        }

        public static TreeNode deserialize(String data){
            String [] dataArray = data.split(",");
            List<String> dataList = new LinkedList<>(Arrays.asList(dataArray));
        return deserializer(dataList);
        }

        public static TreeNode deserializer(List<String> list){
            if(list.get(0).equals("null")){
                list.remove(0);
                return null;
            }

            TreeNode treeNode = new TreeNode(Integer.parseInt(list.get(0)));
            treeNode.left = deserializer(list);
            treeNode.right = deserializer(list);
            return treeNode;
        }


    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree tree = new SerializeAndDeserializeBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(4);
        tree.root.right.right = new TreeNode(5);

        System.out.println("This is the serialized tree string : " + serialize(tree.root));
    }
}
