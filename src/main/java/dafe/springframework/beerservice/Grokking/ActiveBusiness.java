package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActiveBusiness {

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

        return new ArrayList<>();
    }
}
