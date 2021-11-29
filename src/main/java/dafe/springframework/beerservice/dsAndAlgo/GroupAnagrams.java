package dafe.springframework.beerservice.dsAndAlgo;

import java.util.*;

public class GroupAnagrams {
    //create a return variable to store the list
    //create hashmap for the comparison
    //compare each string in the array with the key value in the map and store the values not inside the map
    //add a new arraylist to the value already in the map
    //add the result to a list and return that list
    public static List <List<String>> groupAnagrams(String[] input){

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
        List<List<String>> answer = new ArrayList(myHashMap.values());
        return answer;
    }

    public static List<List<String>> groupAnagrams2(List<String> words){
        Map<String, List<String>> bucket = new HashMap<>();
        for(String word : words) {
            char[] unsorted = word.toCharArray();
            Arrays.sort(unsorted);
            String sortedWord = new String(unsorted);
            if (!bucket.containsKey(sortedWord)) {
                bucket.put(sortedWord, new ArrayList<>(Arrays.asList(word)));
            } else {
                bucket.get(sortedWord).add(word);
            }
        }
        return new ArrayList<>(bucket.values());
    }

    public static void main(String[] args) {

        String [] input = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(input));
        List<String> input2 = new ArrayList<>();
        input2.add("yo");
        input2.add("act");
        input2.add("flop");
        input2.add("tac");
        input2.add("foo");
        input2.add("cat");
        input2.add("oy");
        input2.add("olfp");
        System.out.println("Anagrams before grouping : " + input2);
        System.out.println("These are the group anagrams : " + groupAnagrams2(input2));
    }
}
