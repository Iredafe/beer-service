package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class LruCache {
    int capacity;
    int size = 0;
    Map<Integer, DoubleLinkedNode> cache = new HashMap<>();
    static class DoubleLinkedNode{
        int key;
        int value;
        DoubleLinkedNode next;
        DoubleLinkedNode prev;
    }

    public LruCache(int capacity){
        this.capacity = capacity;
    }
}
