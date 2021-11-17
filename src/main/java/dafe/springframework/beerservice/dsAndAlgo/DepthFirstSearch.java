package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

    static class Node{
        static String name;
        static List <Node> children = new ArrayList<>();

        public Node(String name){
            this.name = name;
        }

        public Node addChild(String name){
            Node child = new Node(name);
            children.add(child);
            return this;
        }
        public List<String> depthFirstSearch(List<String> array){
            array.add(this.name);
            for(int i = 0; i< children.size(); i++){
                children.get(i).depthFirstSearch(array);
            }
            return array;
        }
    }



    public static void main(String[] args) {
        Node node = new Node("A");
        node.addChild("B");
        node.addChild("C");


     //   System.out.println(node.depthFirstSearch());

    }
}
