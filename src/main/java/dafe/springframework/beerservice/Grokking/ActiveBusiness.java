package dafe.springframework.beerservice.Grokking;

import java.util.*;

public class ActiveBusiness {
 static class Businesses{
    EventTypes eventType;
    int occurrence;
    int businessId;

    public Businesses(EventTypes eventType, int occurrence, int businessId){
        this.eventType = eventType;
        this.occurrence = occurrence;
        this.businessId=businessId;
    }
 }
 enum EventTypes{
     ADS,
     PAGE_VIEWS,
     PHOTO_VIEWS,
     REVIEWS
 }

    public static void main(String[] args) {
        List<Businesses> list = Arrays.asList(
                new Businesses(EventTypes.ADS, 7, 3),
                new Businesses(EventTypes.ADS, 8, 2),
                new Businesses(EventTypes.ADS, 5, 1),
                new Businesses(EventTypes.PAGE_VIEWS, 11, 2),
                new Businesses(EventTypes.PAGE_VIEWS, 12, 3),
                new Businesses(EventTypes.PHOTO_VIEWS, 10, 3),
                new Businesses(EventTypes.REVIEWS, 7, 2)
        );

        System.out.println(findActiveBusinesses(list));
    }

    private static List<Integer> findActiveBusinesses(List<Businesses> list) {
        HashMap<EventTypes,int[]> eventCountBusinessCount = new HashMap<>();
        HashMap<EventTypes, Float> eventAverage = new HashMap<>();
        Set<Integer> businessOverAverage = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for(Businesses business : list){
            eventCountBusinessCount.putIfAbsent(business.eventType, new int[]{0,0});
            eventCountBusinessCount.get(business.eventType)[0] += business.occurrence;
            if(business.occurrence > 0)
                eventCountBusinessCount.get(business.eventType)[1]++;
        }

        for(Map.Entry<EventTypes, int[]> entry: eventCountBusinessCount.entrySet()){
            eventAverage.put(entry.getKey(), (float)entry.getValue()[0]/entry.getValue()[1]);
        }

        for(Businesses businessEvent : list){
            if(businessEvent.occurrence < eventAverage.get(businessEvent.eventType)) continue;
            if(businessOverAverage.contains(businessEvent.businessId)){
                resultSet.add(businessEvent.businessId);
            }else {
                businessOverAverage.add(businessEvent.businessId);
            }
        }

        List<Integer>result= new ArrayList<>(resultSet);
        Collections.sort(result, Collections.reverseOrder());
        return result;
 }
}
