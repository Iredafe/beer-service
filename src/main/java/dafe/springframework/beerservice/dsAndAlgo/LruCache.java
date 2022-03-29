package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class LruCache {
    int capacity;
    int size;
    DoubleLinkedNode head;
    DoubleLinkedNode tail;
    Map<Integer, DoubleLinkedNode> cache;
    static class DoubleLinkedNode{
        int key;
        int value;
        DoubleLinkedNode next;
        DoubleLinkedNode prev;
    }

    public LruCache(int capacity){
        this.capacity = capacity;
        cache  = new HashMap<>();
        head = new DoubleLinkedNode();
        tail = new DoubleLinkedNode();
        head.next = tail;
        tail.prev = head;
        size = 0;

    }
}
