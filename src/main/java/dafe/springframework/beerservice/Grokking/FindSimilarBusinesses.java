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

    private static int mostSimilarBusiness(int businessInterestId, List<Reviews> listOfReviews){
       int mostSimilarBizId = businessInterestId;
double maxSimilarity = 0.0;
       HashMap<Integer, Set<Integer>> businessMap = new HashMap();
       for (Reviews review : listOfReviews){
            businessMap.putIfAbsent(review.businessId, new HashSet<>());
            businessMap.get(review.businessId).add(review.userId);
       }

       for(Integer bizId: businessMap.keySet()){
           if(businessInterestId!= bizId){
               Set<Integer> usersOfSimilarBiz = businessMap.get(businessInterestId);
               usersOfSimilarBiz.retainAll(businessMap.get(bizId));

               double intersection = usersOfSimilarBiz.size();

               Set<Integer> union = businessMap.get(businessInterestId);
                     union.addAll(businessMap.get(bizId));
               double similarity = intersection / union.size();
             if(similarity > maxSimilarity){
                 maxSimilarity = similarity;
                 mostSimilarBizId = bizId;
             }
           }
       }
       return mostSimilarBizId;
    }

    private static int mostSimilarBusinessClean(int businessInterestId, List<Reviews> listOfReviews){
        int mostSimilarBizId = businessInterestId;
        double maxSimilarity = 0.0;
        HashMap<Integer, Set<Integer>> businessMap = new HashMap();
        for (Reviews review : listOfReviews){
            businessMap.putIfAbsent(review.businessId, new HashSet<>());
            businessMap.get(review.businessId).add(review.userId);
        }

        for(Integer bizId: businessMap.keySet()){
            if(businessInterestId!= bizId){
                Set<Integer> usersOfSimilarBiz = new HashSet<>(businessMap.get(businessInterestId));
                usersOfSimilarBiz.retainAll(businessMap.get(bizId));

                double intersection = usersOfSimilarBiz.size();

                Set<Integer> union = new HashSet<>(businessMap.get(businessInterestId));
                union.addAll(businessMap.get(bizId));
                double similarity = intersection / union.size();
                if(similarity > maxSimilarity){
                    maxSimilarity = similarity;
                    mostSimilarBizId = bizId;
                }
            }
        }
        return mostSimilarBizId;
    }

    public static void main(String[] args) {
       List<Reviews> listOfReviews= List.of(new Reviews(1,10),
               new Reviews(2,10), new Reviews(1,11), new Reviews(2, 11),
               new Reviews(1,12), new Reviews(2, 12), new Reviews(3,12));
      List<Reviews> reviewsList = List.of(new Reviews(3,44), new Reviews(172, 44), new Reviews(172, 114),
              new Reviews(4, 1), new Reviews(4, 44), new Reviews(7, 44), new Reviews(7, 13), new Reviews(8, 44),
              new Reviews(8, 13), new Reviews(123, 1), new Reviews(2, 1), new Reviews(3,1), new Reviews(8, 4),
              new Reviews(9, 44), new Reviews(9, 4), new Reviews(9, 114));

        System.out.println("similar business is : "
                + findSimilarBusinesses(10, listOfReviews));
        System.out.println("most similar business is : "
                + mostSimilarBusiness(10, listOfReviews));

        System.out.println("most similar business is : "
                + mostSimilarBusiness(1, reviewsList));

        System.out.println("most similar business is : "
                + mostSimilarBusinessClean(1, reviewsList));
    }
}
