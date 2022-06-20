package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.Queue;

public class RateLimit2 {

    static HashMap<String, RequestCounter> clientHitMap = new HashMap<>();


    public static boolean isRequestAllowed(String clientID, int currentTime){
        if(!clientHitMap.containsKey(clientID)){
            RequestCounter requestCounter = new RequestCounter();
            requestCounter.makeRequest(currentTime);
            clientHitMap.put(clientID, requestCounter);
            return true;
        }else{
            RequestCounter requestCounter = clientHitMap.get(clientID);
            return requestCounter.makeRequest(currentTime);
        }
    }


    public static void main(String[] args) {
        int [] time = new int[] {200, 300, 305, 307, 314, 400};
    }
}


class RequestCounter{

    public static int REQUEST_LIMIT = 100;
    public static int TIME_LIMIT = 300;
    static Queue<Integer> requestQueue;

    public static boolean makeRequest(int timestamp){
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
