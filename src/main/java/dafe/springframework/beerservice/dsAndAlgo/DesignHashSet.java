package dafe.springframework.beerservice.dsAndAlgo;

import java.util.LinkedList;

public class DesignHashSet {
    private int keyRange;
    private Bucket[] bucketArray;
    public DesignHashSet() {
        this.keyRange = 769;
        this.bucketArray = new Bucket[keyRange];
        for(int i=0; i<this.keyRange;i++){
            this.bucketArray[i] = new Bucket();
        }
    }

    public int hashFunction(int key){
        return key % this.keyRange;
    }

    public void add(int key) {
        int bucketIndex = hashFunction(key);
        this.bucketArray[bucketIndex].insert(key);
    }

    public void remove(int key) {
        int bucketIndex = hashFunction(key);
        this.bucketArray[bucketIndex].delete(key);
    }

    public boolean contains(int key) {
        int bucketIndex = hashFunction(key);
        return this.bucketArray[bucketIndex].exists(key);
    }

    public static void main(String[] args) {

    }

    private class Bucket {
        private LinkedList<Integer> container;
        public Bucket(){
            container = new LinkedList<>();
        }

        public void insert(Integer key) {
            int index = this.container.indexOf(key);
            if(index== -1){
                this.container.addFirst(key);
            }
        }

        public void delete(Integer key) {
            this.container.remove(key);
        }

        public boolean exists(int key) {
        return true;
        }
    }
}
