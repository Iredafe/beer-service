package dafe.springframework.beerservice.dsAndAlgo;

import java.util.LinkedList;

public class DesignHashMap {
    private int key;
    private int value;
    private Bucket[] bucketArray;
    public DesignHashMap(){

    }

    private class Bucket {
        private LinkedList<Integer> container;
    }
}
