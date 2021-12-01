package dafe.springframework.beerservice.dsAndAlgo;

public class NumberOfWaysToTraverseGraph {
    public static int uniquePaths(int width,int height){

        int [][] numberOfWays = new int[height+1][width+1];
        for(int widthIndex =1; widthIndex < width+1; widthIndex++){
            for(int heightIndex = 1; heightIndex<height+1; heightIndex++){
                if(widthIndex ==1 || heightIndex == 1){
                    numberOfWays[heightIndex][widthIndex] = 1;
                }else{
                    int waysLeft = numberOfWays[heightIndex][widthIndex-1];
                    int waysUp = numberOfWays[heightIndex-1][widthIndex];
                    numberOfWays[heightIndex][widthIndex] = waysLeft+waysUp;
                }
            }
        }
        return numberOfWays[height][width];
    }


    public static void main(String[] args) {
        int width = 4;
        int height= 3;

        System.out.println("These are the unique paths : " + uniquePaths(height, width) );
    }
}
