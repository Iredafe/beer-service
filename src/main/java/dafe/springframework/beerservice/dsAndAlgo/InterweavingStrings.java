package dafe.springframework.beerservice.dsAndAlgo;

public class InterweavingStrings {

    public static boolean isInterveavingStringRecursion(String first, String second, String third){
        if(third.length() != first.length() + second.length()) return false;
        return helper(first, second, third, 0, 0);
    }

    public static boolean helper(String first, String second, String third, int i, int j){
        int k = i+ j;

        if(k == third.length()) return true;

        if(i<first.length() && first.charAt(i) == third.charAt(k)){
            if(helper(first, second, third, i+1, j)) return true;
        }

        if(j<second.length() && second.charAt(j) == third.charAt(k)){
            return helper(first, second, third, i, j+1);
        }

        return false;
    }


    public static boolean isInterweavingStringCache(String first, String second, String third){
        if(third.length() != first.length()+second.length()) return false;

        Boolean [][] cache = new Boolean[first.length()+1][second.length()+1];
        return areInterwovenCached(first,second,third,0,0,cache);
    }

    public static boolean areInterwovenCached(String first, String second, String third, int i, int j, Boolean cache[][]){

        return true;
    }

    public static void main(String[] args) {
        String one = "algoexpert";
        String two ="your-dream-job";
        String three = "your-algodream-expertjob";

        System.out.println("These two strings can be interwoven into the third : " +
                isInterveavingStringRecursion(one,two,three));
    }

}
