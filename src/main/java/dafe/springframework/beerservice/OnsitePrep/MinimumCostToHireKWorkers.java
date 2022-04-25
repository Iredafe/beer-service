package dafe.springframework.beerservice.OnsitePrep;

public class MinimumCostToHireKWorkers {

    public static void main(String[] args) {
        int [] quality = {10,20,5};
        int [] wage ={70,50,30};
        int k = 2;

        System.out.println("This is the minimum cost to hire " +k+ " workers : " + minCostToHireKWorkers());
    }
}
