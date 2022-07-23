package dafe.springframework.beerservice.Grokking;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        String str ="";
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextLine()){ // reading file till EOF
            str+=sc.nextLine();
        }
        try{
            JSONParser parser = new JSONParser(str); // parsing input as json object
            JSONObject json = (JSONObject) parser.parse();
            JSONArray lis1 = (JSONArray)json.get("positive_reviews"); //
            List<PositiveReview> lis = new ArrayList<>(); // making list from input json fields
            for (int i = 0; i < lis1.size(); i++) {
                JSONObject js = (JSONObject) lis1.get(i);
                PositiveReview ps = new PositiveReview(Integer.parseInt(js.get("user_id").toString()),Integer.parseInt(js.get("business_id").toString()));
                lis.add(ps);
            }
            System.out.println(findMostSimilarBusiness(Integer.parseInt(json.get("business_of_interest_id").toString()),lis));
        }
        catch (Exception e){
            e.printStackTrace();
        }




    }
}
