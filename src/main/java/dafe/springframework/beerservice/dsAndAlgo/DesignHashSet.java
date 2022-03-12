package dafe.springframework.beerservice.dsAndAlgo;

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
        public void insert(int key) {
        }

        public void delete(int key) {
        }

        public boolean exists(int key) {
        return true;
        }
    }
}
