package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterRestaurants {

    private static List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance){
        return Arrays.stream(restaurants).filter(s->s[2]>=veganFriendly && s[3]<= maxPrice && s[4]<=maxDistance)
                .sorted((a,b)-> {
                    if(a[1] == b[1]) return b[0]-a[0];
                    else return b[1]-a[1];
                })
                .map(i->i[0])
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
    int [][] restaurants = new int[][]{{1,4,1,40,10},
                                        {2,8,0,50,5},
                                        {3,8,1,30,4},
                                        {4,10,0,10,3},
                                        {5,1,1,15,1}};

    int veganFriendly = 1, maxPrice = 50, maxDistance = 10;

        System.out.println(filterRestaurants(restaurants, veganFriendly, maxPrice, maxDistance));
    }
}
