package dafe.springframework.beerservice.OnsitePrep;

class Worker{
    int quality;
    int wage;
    int ratio;

    public Worker(int quality, int wage){
        this.quality = quality;
        this.wage = wage;
        ratio = (int) (wage*1.0/quality);
    }
}
public class MinimumCostToHireKWorkers {

    private static int minCostToHireKWorkers(int [] quality, int [] wage, int k){

        return 0;
    }


    public static void main(String[] args) {
        int [] quality = {10,20,5};
        int [] wage ={70,50,30};
        int k = 2;

        System.out.println("This is the minimum cost to hire " +k+ " workers : " + minCostToHireKWorkers(quality, wage, k));
    }
}
