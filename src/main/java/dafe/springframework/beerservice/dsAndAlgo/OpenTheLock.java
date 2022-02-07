package dafe.springframework.beerservice.dsAndAlgo;

public class OpenTheLock {

    public static int openTheLock(String [] deadends, String target){

        return -1;
    }

    public static void main(String[] args) {
        String [] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";

        System.out.println("This is the depth : " + openTheLock(deadends, target));
    }
}
