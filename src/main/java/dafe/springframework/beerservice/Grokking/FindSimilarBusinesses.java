package dafe.springframework.beerservice.Grokking;

import java.util.*;

public class FindSimilarBusinesses {

   static class Reviews{
        int userId;
        int businessId;
        public Reviews(int userId, int businessId){
            this.userId = userId;
            this.businessId = businessId;
        }
    }

    private static int findSimilarBusinesses(int businessOfInterestId, List<Reviews> reviewsList){
        double max=0;
        int similarBusinessId=-1;

        HashMap<Integer, Set<Integer>> businessToUserMap = new HashMap<>();
        for(Reviews review : reviewsList){
            businessToUserMap.putIfAbsent(review.businessId, new HashSet<>());
            businessToUserMap.get(review.businessId).add(review.userId);
        }

        for(Integer businessId : businessToUserMap.keySet()){
            if(businessId!=businessOfInterestId){
                Set<Integer> usersOfSimilarBusiness = businessToUserMap.get(businessOfInterestId);
                usersOfSimilarBusiness.retainAll(businessToUserMap.get(businessId));

                int intersection = usersOfSimilarBusiness.size();
                int total = businessToUserMap.get(businessId).size() +
                        businessToUserMap.get(businessOfInterestId).size()
                        -intersection;
                double rate = intersection/total;

                if(rate > max){
                    max=rate;
                    similarBusinessId=businessId;
                }
            }
        }

        return similarBusinessId;
    }


    public static void main(String[] args) {
       List<Reviews> listOfReviews= List.of(new Reviews(1,10),
               new Reviews(2,10), new Reviews(1,11), new Reviews(2, 11),
               new Reviews(1,12), new Reviews(2, 12), new Reviews(3,12));
        System.out.println("similar business is : "
                + findSimilarBusinesses(10, listOfReviews));
    }
}
