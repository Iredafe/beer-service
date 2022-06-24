package dafe.springframework.beerservice;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class RateLimiter {

/*
avoid overloading the system

    rate limit - each customer can make
    Each customer can make X requests per Y seconds

    // Perform rate limiting logic for provided customer ID. Return true if the
// request is allowed, and false if it is not.
boolean rateLimit(int customerId)

    //Acceptance Criteria
    if x - 3 & y-2
    request size = 3, timeLimit - 2
    - client to only make at most 3 requests per 2 seconds
    - identify a request by client who made it
    - returns true when request is allowable
    - returns false when it is not
    - input customer id.
    - you can pass in time for testing
    //test cases
    - when a client makes a request the first time, it is allowed
    - when a client makes a request more than 3 times within 2 seconds, it is disallowed
    - when a client makes a request more than 3 times in the 3rd second, it is allowed

//solution
keep track of customerid and requests in map
call the is allowed method pass customer id and time

*/
    static class RequestBody{
       Deque<Integer> requestQueue;
        static int TIME_LIMIT=2;
        static int REQUEST_LIMIT=3;

        public RequestBody(){
            requestQueue = new LinkedList<>();
        }

        private boolean makeRequest(int requestTime){
            while(!requestQueue.isEmpty() && requestTime - requestQueue.peekFirst() >= TIME_LIMIT){
                requestQueue.pollFirst();
            }

            if(requestQueue.size() < REQUEST_LIMIT){
                requestQueue.addLast(requestTime);
                return true;
            }
        return false;
        }
}
    static HashMap<Integer, RequestBody> customerRequestBodyMap = new HashMap<>();
    private static boolean isAllowed(int customerId, int currentTime){

        if(!customerRequestBodyMap.containsKey(customerId)){
            RequestBody requestBody = new RequestBody();
            requestBody.makeRequest(currentTime);
            customerRequestBodyMap.put(customerId, requestBody);
            return true;
        }else{
            RequestBody requestBody = customerRequestBodyMap.get(customerId);
            boolean requestAllowed = requestBody.makeRequest(currentTime);
            return requestAllowed;
        }
    }

    public static void main(String[] args) {
        //time limit = 3, request limit = 2
        int customerId = 1;
        int [] time= {1,2,2,4,5};
        for(int currentTime : time){
            System.out.println("Is this customer allowed  " + isAllowed(customerId, currentTime));
        }
    }
}
