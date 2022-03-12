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
        return key % keyRange;
    }

    public void add(int key) {

    }

    public void remove(int key) {

    }

    public boolean contains(int key) {

        return true;
    }

    public static void main(String[] args) {

    }

    private class Bucket {
    }
}
