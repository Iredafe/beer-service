package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int [] temperatures){
        int [] output = new int[temperatures.length];
        for(int i=0; i< temperatures.length; i++){
            int count=0;
            for(int j=i; j< temperatures.length-1; j++){
                if(temperatures[i] > temperatures[j]){

                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int [] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println("This is the output : " + Arrays.toString(dailyTemperatures(temperatures)));
    }
}
