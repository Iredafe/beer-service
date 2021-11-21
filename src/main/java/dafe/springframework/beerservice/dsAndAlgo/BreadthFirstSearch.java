package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class BreadthFirstSearch {

    static class Node{

        static String name;
        static List<Node> children = new ArrayList<>();

        public Node(String name){
            this.name = name;
        }
        public Node addChild(String name){
            Node child = new Node(name);
            children.add(child);

            return this;
        }
    }


}
