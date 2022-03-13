package dafe.springframework.beerservice.dsAndAlgo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DesignHashMap {
    private List<Bucket> hashTable;
    private int keyRange;
    public DesignHashMap(){
        this.keyRange = 769;
        this.hashTable = new ArrayList();
    }

    int hashFunction(int key){
        return key % keyRange;
    }
    public void put(int key, int value) {
        int bucketIndex = hashFunction(key);
        hashTable.get(bucketIndex).update(key,value);
    }

    public int get(int key) {
        int bucketIndex = hashFunction(key);
        hashTable.get(bucketIndex).get(key);
        return 0;
    }

    public void remove(int key) {
        int bucketIndex = hashFunction(key);
        hashTable.get(bucketIndex).delete(key);
    }


    private class Bucket {
        private List<Pair<Integer, Integer>> bucket;

        public Bucket(){
            bucket = new LinkedList<>();
        }
        public void update(int key, int value) {
            for(Pair<Integer, Integer> pair : bucket){
                if(pair.first.equals(key)){
                   pair.second = value;
                }else{
                    bucket.add(new Pair<>(key, value));
                }
            }
        }

        public Integer get(int key) {
            for(Pair<Integer, Integer> pair : bucket){
                if(pair.first.equals(key)){
                    return pair.second;
                }else{
                    return -1;
                }
            }
        }

        public void delete(int key) {
        }
    }

    private class Pair<U, V> {
        private U first;
        private V second;

        public Pair(U first, V second){
            this.first= first;
            this.second = second;
        }
    }
}
