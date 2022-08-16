package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DetectAndOrderBusiness {

    static class Business{
        String name;
        String location;
        String id;

        public Business(String name, String location, String id){
            this.name = name;
            this.location=location;
            this.id=id;
        }
    }

    static class Chain {
        String name;
        Integer frequency;

        public Chain(String name, Integer frequency){
            this.name=name;
            this.frequency=frequency;
        }
    }


    private static List<Chain> detectAndOrderBusiness(List<Business> businesses, String location){

        HashMap<String, Chain> stringChainHashMap = new HashMap<>();
        HashSet<String> seen = new HashSet<>();

        for(Business business : businesses){
            if(business.location.equals(location) && !seen.contains(business.name)){
                seen.add(business.name+business.id);
                if(stringChainHashMap.containsKey(business.name)){
                    stringChainHashMap.get(business.name).frequency++;
                }else {
                    stringChainHashMap.put(business.name, new Chain(business.name,1));
                }
            }
        }


        return new ArrayList<>();
    }
    public static void main(String[] args) {
       List<Business> businessList = new ArrayList<>();
       businessList.add(new Business("HM","Vancouver", "101"));
       businessList.add(new Business("NIKE","Burnaby", "103"));
       businessList.add(new Business("HM","Vancouver", "102"));
       businessList.add(new Business("NIKE","Vancouver", "104"));
       businessList.add(new Business("MK","Surrey", "105"));
       businessList.add(new Business("DQ","Surrey", "106"));
       businessList.add(new Business("Church's Chicken","Surrey", "107"));
       businessList.add(new Business("HM","Surrey", "108"));
       businessList.add(new Business("HM","Surrey", "109"));

    }
}
