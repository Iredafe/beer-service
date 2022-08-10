package dafe.springframework.beerservice.Grokking;

import java.util.List;

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
        int max=0;
        int similarBusinessId=-1;


        return similarBusinessId;
    }
}
