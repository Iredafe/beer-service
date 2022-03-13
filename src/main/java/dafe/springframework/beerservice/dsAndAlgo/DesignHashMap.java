package dafe.springframework.beerservice.dsAndAlgo;

import org.springframework.data.util.Pair;

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
        int bucketIndex = this.hashTable.indexOf(key);
        hashTable.get(key).update(key,value);
    }

    public int get(int key) {
        return 0;
    }

    public void remove(int key) {

    }


    private class Bucket {
        private List<Pair<Integer, Integer>> bucket;

        public void update(int key, int value) {
        }
    }
}
