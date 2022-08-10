package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
                Set<Integer> usersOfSimilarBusiness = businessToUserMap.get(businessId);
                usersOfSimilarBusiness.retainAll(businessToUserMap.get(businessOfInterestId));

                int intersection = usersOfSimilarBusiness.size();
                int total = businessToUserMap.get(businessId).size() +
                        businessToUserMap.get(businessOfInterestId).size()
                        -intersection;
                double rate = intersection/total;


            }

        }

        return similarBusinessId;
    }
}
