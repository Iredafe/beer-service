package dafe.springframework.beerservice.Grokking;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BusinessSimilarity {
    static class PositiveReview {
        Integer userId;
        Integer businessId;

        public PositiveReview(Integer userId, Integer businessId) {
            this.userId = userId;
            this.businessId = businessId;
        }

        public Integer getUserId() {
            return this.userId;
        }
        public Integer getBusinessId() {
            return this.businessId;
        }
    }

    private static int findMostSimilarBusiness(int business_of_interest_id, List<PositiveReview> reviewList) {
        HashMap<Integer, Set<Integer>> businessToUserMap = new HashMap<>();

        for(PositiveReview review : reviewList){
            businessToUserMap.putIfAbsent(review.getBusinessId(), new HashSet<>());
            businessToUserMap.get(review.getBusinessId()).add(review.getUserId());
        }
        double max = 0;
        int similarBusiness = -1;

        for(Integer businessPk : businessToUserMap.keySet()){
            if(businessPk != business_of_interest_id){
                Set<Integer> interestedBusinessUser = new HashSet<>();
                interestedBusinessUser.addAll(businessToUserMap.get(business_of_interest_id));

                interestedBusinessUser.retainAll(businessToUserMap.get(business_of_interest_id));
                double common = interestedBusinessUser.size();

                double total = businessToUserMap.get(business_of_interest_id).size()+
                                businessToUserMap.get(business_of_interest_id).size()-common;
                double rate=common/total;
            if(rate > max){
                max=rate;
                similarBusiness=business_of_interest_id;
            }
            }
        }

        return 0;
    }


    public static void main(String[] args) {

    }
}
