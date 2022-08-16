package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
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
    public static void main(String[] args) {
       List<Business> businessList = new ArrayList<>();
    }
}
