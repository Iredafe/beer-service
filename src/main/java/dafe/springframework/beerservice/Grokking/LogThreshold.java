package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LogThreshold {

    /*
     * Complete the 'processLogs' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY logs
     *  2. INTEGER threshold
     */

    public static List<String> processLogs(List<String> logs, int threshold) {
        // Write your code here
        //loop through the logs
        //for each log entry, split the string into an array
        //loop through the split string and store key value pair map of sender/recipient - frequency
        //if the frequency is more greater than or equal to 2, add it to the output list
        //else, keep looping till you reach end of log


        HashMap<String, Integer> idFrequencyMap = new HashMap<>();
        List<String> output = new ArrayList<>();

        for(String log : logs){
            String [] digits = log.split(" ");
            for(int index=0; index<digits.length-1; index++){
                String key  = digits[index];
                idFrequencyMap.put(key,idFrequencyMap.getOrDefault(key, 0)+1);
                System.out.println("keys : " + idFrequencyMap.keySet() + ", values " + idFrequencyMap.values());
                if(idFrequencyMap.get(key) >= threshold && !output.contains(key)){
                    output.add(key);
                }
            }
        }
        System.out.println(output.toString());
        return output;
    }

    public static void main(String[] args) {
        List<String> logs = Arrays.asList("1 2 50", "1 7 70", "1 3 20", "2 2 17");
        int threshold = 2;
        System.out.println("solution : " + processLogs(logs, threshold));
    }
}