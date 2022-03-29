package dafe.springframework.beerservice.dsAndAlgo;

public class LruCache {
    int capacity;
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
