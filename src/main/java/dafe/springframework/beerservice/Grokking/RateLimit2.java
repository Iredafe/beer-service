package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.Queue;

public class RateLimit2 {

    public int REQUEST_LIMIT = 100;
    public int TIME_LIMIT = 300;
    HashMap<String, HitCounter> clientHitMap = new HashMap<>();

    class HitCounter{
        Queue<Integer> requestQueue;

        public boolean makeRequest(int timestamp){
            //clean up
            while (!requestQueue.isEmpty()){
                if(timestamp - requestQueue.peek() >= TIME_LIMIT){
                    requestQueue.remove();
                }else break;
            }

            if(requestQueue.size() < REQUEST_LIMIT){
                requestQueue.add(timestamp);
                return true;
            }
            return false;
        }
    }


    public static boolean isRequestAllowed(String clientID, int currentTime){

    }
}
