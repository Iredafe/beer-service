package dafe.springframework.beerservice.Grokking;

public class Karat1FindRectangle {

    public static void main(String[] args) {
        int [][] image=new int[][] {{1,1,1,1,1,1,1},
                                    {1,1,1,1,1,1,1},
                                    {1,1,1,0,0,0,1},
                                    {1,1,1,0,0,0,1},
                                    {1,1,1,1,1,1,1}};

        System.out.println("Find rectangle index : " + findRectagle());
    }
}
