package dafe.springframework.beerservice.OnsitePrep;

public class UnionFind {

    private int[] root;

    public UnionFind(int size){
        root = new int[size];
        for(int i=0; i<size; i++){
            root[i] = i;
        }
    }

    public int find(int x){
        return root[x];
    }
}
