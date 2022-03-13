package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DesignHashMap {
    private List<Bucket> hashTable;
    private int keyRange;
    public DesignHashMap(){
        this.keyRange = 769;
        this.hashTable = new ArrayList<Bucket>();
    }

    private class Bucket {
    }
}
