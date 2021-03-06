package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int [] temperatures){
        int [] output = new int[temperatures.length];
        for(int i=0; i< temperatures.length; i++){
            for(int j=i+1; j< temperatures.length; j++){
                if(temperatures[j] > temperatures[i]){
                    output[i]= j-i;
                    break;
                }
            }
        }
        return output;
    }

    public static int[] dailyTemp(int [] temperatures){
        int [] output = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<temperatures.length; i++){
            int currentTemp = temperatures[i];
            while(!stack.isEmpty() && temperatures[stack.peek()] < currentTemp){
                Integer previousDay = stack.pop();
                output[previousDay] = i- previousDay;
            }
            stack.push(i);
        }
        return output;
    }

    public static void main(String[] args) {
        int [] temperatures = {73,74,75,71,69,72,76,73};
        int [] temp = {73,74,75,71,69,72,76,73};
        System.out.println("This is the output : " + Arrays.toString(dailyTemperatures(temperatures)));
        System.out.println("This is the output2 : " + Arrays.toString(dailyTemp(temp)));
    }
}
