package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class SunsetViews {

    public static ArrayList<Integer> sunsetView(int[] buildings, String direction){

        ArrayList<Integer> stack = new ArrayList<>();
        int startIdx = buildings.length-1;
        int step = -1;
        if(direction == "EAST"){
            startIdx = 0;
            step = 1;
        }
        int idx =startIdx;
         while(idx >= 0 && idx<buildings.length){
            int buildingHeight = buildings[idx];
            while(stack.size()>0 && buildings[stack.get(stack.size()-1)] <= buildingHeight){
                stack.remove(stack.size()-1);
            }
            stack.add(idx);
            idx+=step;
        }

        return stack;
    }

    public static void main(String[] args) {
        int [] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        String direction1 ="EAST";
        String direction2 = "WEST";

        System.out.println("These are the buildings when sunset is east: " + sunsetView(buildings, direction1));
        System.out.println("These are the buildings when sunset is west : " + sunsetView(buildings, direction2));
    }
}
