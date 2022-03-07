package dafe.springframework.beerservice.dsAndAlgo;

public class FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        return image;
    }

    public static void main(String[] args) {
        int image[][] = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1; int sc = 1; int newColor= 2;

        System.out.println("The new image is : " + floodFill(image,sr,sc,newColor));
    }
}
