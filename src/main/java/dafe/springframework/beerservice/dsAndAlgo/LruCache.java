package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class LruCache {
    static int capacity;
    static int size;
    static DoubleLinkedNode head;
    static DoubleLinkedNode tail;
    static Map<Integer, DoubleLinkedNode>  cache  = new HashMap<>();
    static class DoubleLinkedNode{
        int key;
        int value;
        DoubleLinkedNode next;
        DoubleLinkedNode prev;
    }

    public LruCache(int capacity){
        this.capacity = capacity;
        head = new DoubleLinkedNode();
        tail = new DoubleLinkedNode();
        head.next = tail;
        tail.prev = head;
        size = 0;

    }

    //head.next <-> prev.node to add.next <-> prev.tail
    public static void addNode(DoubleLinkedNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    //head.next <-> prev.node to remove.next <-> prev.tail
    public static void removeNode(DoubleLinkedNode node){
        DoubleLinkedNode prev = node.prev;
        DoubleLinkedNode next = node.next;

        prev.next = prev;
        next.prev = next;
    }

    public static void moveToHead(DoubleLinkedNode node){
        removeNode(node);
        addNode(node);
    }

    public static DoubleLinkedNode popTail(){
        DoubleLinkedNode result = tail.prev;
        removeNode(result);
        return result;
    }

    public static void put(int key, int value){
        DoubleLinkedNode node = cache.get(key);
        if(node == null){
            DoubleLinkedNode newNode = new DoubleLinkedNode();
            newNode.key = key;
            newNode.value = value;
            addNode(node);
            cache.put(key, newNode);
            ++size;

            if(size > capacity){
                DoubleLinkedNode tail = popTail();
                --size;
                cache.remove(tail.key);
            }
        }else{
            node.value = value;
            moveToHead(node);
        }
    }

    public static int get(int key){
        DoubleLinkedNode node = cache.get(key);
        if(node == null) return -1;
        moveToHead(node);
        return node.value;
    }
}
