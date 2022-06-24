package dafe.springframework.beerservice.Gym;

import java.util.*;

public class RankTeamByVotes {

    private static String rankTeam(String[] votes) {

        int length = votes[0].length();
        Map<Character, int[]> votingEngine = new HashMap<>();
        for (String vote : votes) {
            for (int index = 0; index < length; index++) {
                char character = vote.charAt(index);
                votingEngine.putIfAbsent(character, new int[length]);
                votingEngine.get(character)[index]++;
            }
        }

        List<Character> list = new ArrayList<>(votingEngine.keySet());

        list.sort((a, b) -> {
            for (int i = 0; i < length; i++) {
                if (votingEngine.get(a)[i] != votingEngine.get(b)[i]) {
                    return votingEngine.get(b)[i] - votingEngine.get(a)[i];
                }
            }
            return a - b;
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (char character : list) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }

    //     List<List<String>> theVotes = Arrays.asList(Arrays.asList("ABC","ACB","ABC","ACB","ACB"));
    public static String rankTeamByVotes(List<List<String>> votes) {
        HashMap<Character, int[]> ballot = new HashMap<>();
        int length = votes.get(0).get(0).length();
        votes.get(2);
        for (int i = 0; i < votes.size(); i++) {
            for (int j = 0; j < length; j++) {
                List<String> voteList = votes.get(i);
                String string = String.join("",voteList);
                char character = string.charAt(j);
                ballot.putIfAbsent(character, new int[length]);
                ballot.get(character)[j]++;
            }
        }

        List<Character> list = new ArrayList<>(ballot.keySet());
        Collections.sort(list, (a, b) -> {
            for (int i = 0; i < votes.size(); i++) {
                if (ballot.get(a)[i] != ballot.get(b)[i]) {
                    return ballot.get(b)[i] - ballot.get(a)[i];  //sort in descending order
                }
            }
            return a - b; //returns 1 if a > b and returns -1 if b > a
        });

        StringBuilder sb = new StringBuilder();
        for (char character : list) {
            sb.append(character);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String[] votes = {"ABC", "ACB", "ABC", "ACB", "ACB"};

        List<String> list1 = Arrays.asList("ABC");
        List<String> list2 = Arrays.asList("ACB");
        List<String> list3 = Arrays.asList("ABC");
        List<String> list4 = Arrays.asList("ACB");
        List<String> list5 = Arrays.asList("ACB");
        List<List<String>> theVotes = Arrays.asList(list1, list2, list3, list4, list5);

        //  System.out.println("The result of the vote is : " + rankTeam(votes));
        System.out.println("The result of the vote is : " + rankTeamByVotes(theVotes));
    }

     /*
vote index-> 0  1  2
     team A :5  0  0
     team B :0  2  3
     team C :0  3  2

 map :       A :[5,  0,  0]
             B :[0,  2,  3]
             C :[0,  3,  2]
sort according to frequency of votes
first-> A, second-> B, third -> C
     */
}
/*
Now, let’s plan a big reunion dinner. Count the number of individuals who are parents, and the number who are not parents.

Write a function that returns both of those counts using whatever data structure you’d like.

Sample input and output:

    1   2    4
     \ /   / | \
      3   5  8  9
       \ / \     \
        6   7    11

parent_child_pairs = [
    00
    (1, 3),
    10
    (2, 3),
    20
    (3, 6),
    (5, 6),
    (5, 7),
    (4, 5),
    (4, 8),
    (4, 9),
    (9, 11)
]

//test cases - 3
-a parent that has a child but has no parent (root parent)
-a parent that has a parent, and has a child (e.g 5)
- a child that is a parent(similar to previous)
- a child that has no children (leaf)



//solution plan
-use a hashmap
- map the values with their index
-loop through the input
- if a value exists in the first index, increment parent variable
- if a value does not exist in the first index but exists in the second index increment the child variable
-if a value exists in both - increment the parent


# Returns
6, 4

# because
# 6 parents: 1,2,3,4,5,9
# 4 non-parents: 6,7,8,11

Complexity Analysis variables:

n: the number of pairs in the input

import java.io.*;
import java.util.*;

public class Solution {

  private static int[] findParentChildPairs(int [][] parentChildTree){
    HashMap<Integer, Integer> parentIndexMap = new HashMap<>();
    int rowLength = parentChildTree.length;
    int colLength = parentChildTree[0].length;
    int parent=0;
    int child=0;

    for(int row=0; row<rowLength; row++){
      parentId = parentChildTree[row][0];
      childIld = parentChildTree[row][1];

      if (parentIndexMap.containsKey(parentId)) {
        ...
      }

      for(int col=0; col<colLength; col++){
        int node = parentChildTree[row][col];
        System.out.println("nodes " + node);

        //  System.out.println("parents indexes : " + parentChildTree[row][0]);
        if(!parentIndexMap.containsKey(node) && col==0){
          System.out.println("parent " + node);
          parentIndexMap.put(node, 0);
          parent++;
        }else if(!parentIndexMap.containsKey(node) && row==0){
          parentIndexMap.put(node, 1);
          //System.out.println("child " + node);
          child++;
        }
      }
    }
    System.out.println("map " + parentIndexMap.toString());
    return new int[]{parent, child};
  }

  public static void main(String[] argv) {
    int[][] parentChildPairs = new int[][] {
      {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7},
      {4, 5}, {4, 8}, {4, 9}, {9, 11}
    };

    System.out.println("Parent - child : " + Arrays.toString(findParentChildPairs(parentChildPairs)));

  }
}

*/