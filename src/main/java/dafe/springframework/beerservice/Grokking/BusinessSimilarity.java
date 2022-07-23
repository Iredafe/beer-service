package dafe.springframework.beerservice.Grokking;


import java.util.List;

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

    private static int findMostSimilarBusiness(int business_of_interest_id, List<PositiveReview> lis) {
        return 0;
    }


    public static void main(String[] args) {

    }
}
