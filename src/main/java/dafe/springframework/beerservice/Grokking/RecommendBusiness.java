package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    static class RecommendedBusinesses{
        static Map<Business, Boolean> visited = new HashMap<>();
        static List<String> result = new ArrayList<>();


        private static List<String> getReachableBusinesses(Business startingBusiness, int distance){
            visited.put(startingBusiness, true);
            dfs(startingBusiness, distance, 0);
            return result;
        }

        private static void dfs(Business startingBusiness, int distance, int current){
            Map<Business, Integer> businessDistanceMap = startingBusiness.getNearbyBusinesses();

            for(Business business : businessDistanceMap.keySet()){
               if(!visited.getOrDefault(business, false)
                       && businessDistanceMap.get(business) + current <= distance){
                   result.add(business.getName());
                   visited.put(business, true);
                   dfs(business, distance, current+businessDistanceMap.get(business));
               }
            }
        }

    }

    public static void main(String[] args) {

    }
}
