package dafe.springframework.beerservice.dsAndAlgo;

public class MaxProfit {

    public static int maxProfit(int [] prices){
 //problem statement:
        //find the minimum value in the array
        //find the maximum value in index after the minimum value
        //return the difference as an integer : maximumProfit

        //solution breakdown:
        //initialize the min & max variables
        //loop through the array to find the indexes of min and max values
        //return the difference of min and max
        // this solution would be of time complexityO(n)
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i=0; i<prices.length; i++){
        if(prices[i]<min){
            min=prices[i];
        }
        if(prices[i]-min>max){
            max=prices[i]-min;
        }
    }
return max;
    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println("This is the maximum profit : " + maxProfit(prices));
    }
}
