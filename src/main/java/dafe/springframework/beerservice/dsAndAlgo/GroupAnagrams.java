package dafe.springframework.beerservice.dsAndAlgo;

import java.util.*;

public class GroupAnagrams {
    //create a return variable to store the list
    //create hashmap for the comparison
    //compare each string in the array with the key value in the map and store the values not inside the map
    //add a new arraylist to the value already in the map
    //add the result to a list and return that list
    public static List <List<String>> groupAnagrams(String[] input){

        List<List<String>> answer = new ArrayList();
        Map<String, List<String>> myHashMap = new HashMap();
        for(String str: input){
            char[] characters = str.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);
            if(!myHashMap.containsKey(sorted)){
                myHashMap.put(sorted, new ArrayList<>());
            }
            myHashMap.get(sorted).add(str);
        }
        answer.addAll(myHashMap.values());
        return answer;
    }

    public static List<List<String>> groupAnagrams2(List<String> words){

        return new ArrayList<>();
    }

    public static void main(String[] args) {

        String [] input = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(input));
    }
}
