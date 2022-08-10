package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.Map;

public class RecommendBusiness {
    class Business{
        String name;
        Map<Business, Integer> nearbyBusinesses = new HashMap<>();

        public Business(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }

        public Map<Business, Integer> getNearbyBusinesses(){
            return this.nearbyBusinesses;
        }

    }
}
