package dafe.springframework.beerservice.Gym;

import java.util.LinkedList;
import java.util.Queue;

public class HitCounter {

    static Queue<Integer> hits;
    public HitCounter(){
        hits = new LinkedList<>();
    }

    public static void hit(int timestamp){
        hits.add(timestamp);
    }

    public static int getHits(int timestamp){

        while (!hits.isEmpty()){
            int diff = timestamp-hits.peek();
            if(diff>300){
                hits.remove();
            }else{
                break;
            }
        }

        return hits.size()-1;
    }
}
