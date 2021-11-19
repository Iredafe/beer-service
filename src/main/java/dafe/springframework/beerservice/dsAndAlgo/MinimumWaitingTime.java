package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class MinimumWaitingTime {

    //GREEDY ALGORITHM
    public static  int minimumWaitingTime(int [] queries){
        //sort the array
        //loop through the array
        //at each index, get the value in the previous index and multiply it by the number of indexes left
        //update the total no of queries with your answer
        //after looping the array, return the total no of minimum waiting time
        int minimumWaitTime =0;
        Arrays.sort(queries);
        if(queries.length==0) return minimumWaitTime;
        for(int index = 0; index<queries.length; index++){
            int queryDuration = queries[index];
            int numberOfWaitingQueries = queries.length-(index+1);
            minimumWaitTime += queryDuration * numberOfWaitingQueries;
        }

        return minimumWaitTime;
    }


    public static void main(String[] args) {

        int [] arrayOfQueries = {3, 2, 1, 2, 6};

        System.out.println("This is the minimum waiting time for the query to complete : " + minimumWaitingTime(arrayOfQueries));
    }
}
