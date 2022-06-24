package dafe.springframework.beerservice.Gym;

import java.util.HashMap;
import java.util.LinkedList;
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
        int [] timeArray = new int[] { 305, 307, 308, 309, 310, 311, 312, 313,314};

        for (int currentTime : timeArray){
            String client = "dee1234";
            System.out.println("Is request allowed for client "+client+ ": "
                    + isRequestAllowed(client,currentTime));
        }
    }
   static class RequestCounter{

        public static int REQUEST_LIMIT = 3;
        public static int TIME_LIMIT = 5;
        static Queue<Integer> requestQueue;

        public RequestCounter(){
            requestQueue = new LinkedList<>();
        }

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
}
