package dafe.springframework.beerservice.Grokking;


import java.util.HashMap;
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

    private static int findMostSimilarBusiness(int business_of_interest_id, List<PositiveReview> list) {
        HashMap<Integer, Set<Integer>> businessToUserMap = new HashMap<>();
        double max = 0;
        return 0;
    }


    public static void main(String[] args) {

    }
}
