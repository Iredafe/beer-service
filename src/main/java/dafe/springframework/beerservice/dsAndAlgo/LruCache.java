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

    //head.next <-> prev.node to add.next <-> prev.tail
    public void addNode(DoubleLinkedNode node){
        head.next = node;
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
    }
    //head.next <-> prev.node to remove.next <-> prev.tail
    public void removeNode(DoubleLinkedNode node){
        DoubleLinkedNode prev = node.prev;
        DoubleLinkedNode next = node.next;

        prev.next = prev;
        next.prev = next;
    }

    public void moveToHead(DoubleLinkedNode node){
        removeNode(node);
        addNode(node);
    }

    public DoubleLinkedNode popTail(){
        DoubleLinkedNode result = tail.prev;
        removeNode(result);
        return result;
    }

    public static void put(int key, int value){

    }

    public static int get(int key){

        return key;
    }
}
