package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;
import java.util.HashMap;

public class Karat1FindRectangle {

    private static int[] findRectangle(int[][] image) {

        for(int row=0; row<image.length; row++){
            for(int col=0; col<image[row].length; col++){
                if(image[row][col] == 0){
                    return new int[]{row,col};
                }
            }
        }
            return new int[]{};
    }

    private static HashMap<String, Integer> urlMapper(String [] array){

        HashMap<String, Integer> resultMap = new HashMap<>();
        Integer clickCount = 0;
        String urlKey = "";

        for(String url : array){
            StringBuilder processedUrl = new StringBuilder();
            for(char character : url.toCharArray()){
                if(character!=','){
                    processedUrl.append(character);
                }else {
                    String [] value = url.split(",");
                    urlKey = value[1];
                    break;
                }
            }
            String countString = processedUrl.toString();
            clickCount = Integer.parseInt(countString);

            if(resultMap.containsKey(urlKey)){
                resultMap.put(urlKey, resultMap.get(urlKey)+clickCount);
            }else{
                resultMap.put(urlKey, clickCount);
            }
        }

        return resultMap;
    }

    public static void main(String[] args) {

        String [] urlCounts=new String[] {"91, google.com",
                "9, stackoverflow.com",
                "1, twitter.com",
                "10, google.com",
                "3, twitter.com"};

        int [][] image=new int[][] {{1,1,1,1,1,1,1},
                                    {1,1,1,1,1,1,1},
                                    {1,1,1,0,0,0,1},
                                    {1,1,1,0,0,0,1},
                                    {1,1,1,1,1,1,1}};

//        System.out.println("Find rectangle index : " + Arrays.toString(findRectangle(image)));
        System.out.println("Find url - count mapping : " + urlMapper(urlCounts));
    }

}
