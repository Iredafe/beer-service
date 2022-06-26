package dafe.springframework.beerservice.Gym.InterviewingIO;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 Spend a gift card on food items for a meal at a restaurant

Constraints/Hints:
- must use 100% of the gift card value
- any item can be purchased an unlimited number of times

Inputs:
- $0 < all money values <= $1,000
- 1 <= menu size <= 100
- menu names/prices are unique to each other


Part One:

- write a method that processes a single gift card amount at a time
- return an array/list of strings indicating the menu item names which spend 100% of the gift card
- return an empty array/list if you cannot find an answer.
- more than one answer might be possible, stop and return the FIRST one you find

Example:
    menu:
    $15 full dinner
    $4 sandwich
    $3 milkshake

purchase_food(10.00)
    ... would return ['sandwich', 'milkshake', 'milkshake']
purchase_food(5.00)
    ... would return []

 */
public class Test1 {
    public static void main(String[] args) {
        Map<String, Double> menu = new LinkedHashMap<>();
        menu.put("sandwich", 6.85);
        menu.put("toast", 2.20);
        menu.put("curry", 7.85);
        menu.put("egg", 3.20);
        menu.put("cheese", 1.25);
        menu.put("coffee", 1.40);
        menu.put("soup", 3.45);
        menu.put("soda", 2.05);

        List<Double> testCases = Arrays.asList(5.00, 14.00, 19.00, 25.00, 33.00, 45.00, 49.00, 99.00, 114.00, 199.00);

    }
}
