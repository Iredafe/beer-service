package dafe.springframework.beerservice.dsAndAlgo;

public class FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
       int pixel = image[sr][sc];
        if(pixel != newColor){
            dfs(image, sr, sc, pixel);
        }

        return image;
    }

    private static void dfs(int[][] image, int r, int c, int pixel) {
        if(image[r][c] == pixel){
            dfs(image, r+1, c, pixel);
            dfs(image, r,c+1,pixel);
            dfs(image, )
        }
    }

    public static void main(String[] args) {
        int image[][] = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1; int sc = 1; int newColor= 2;

        System.out.println("The new image is : " + floodFill(image,sr,sc,newColor));
    }
}
//loop through the matrix to the image
//if the image has any same color pixel in any of the 4 direction, perform a dfs on each and update the color to new color
//else do nothing
//if you get to the end of the matrix, return result