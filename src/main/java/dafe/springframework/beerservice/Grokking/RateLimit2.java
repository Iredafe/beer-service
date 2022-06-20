package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.Queue;

public class RateLimit2 {

    public int REQUEST_LIMIT = 100;
    public int TIME_LIMIT = 300;
    HashMap<String, HitCounter> clientHitMap = new HashMap<>();

    class HitCounter{
        Queue<Integer> requestQueue;
    }
}
