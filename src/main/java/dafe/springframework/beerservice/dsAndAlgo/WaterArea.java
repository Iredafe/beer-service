package dafe.springframework.beerservice.dsAndAlgo;

public class WaterArea {

    public static int waterArea(int heights[]){
        int surfaceArea =0;
        int leftIdx = 0;
        int rightIdx=heights.length-1;
        int leftMax = heights[leftIdx];
        int rightMax = heights[rightIdx];

        while(leftIdx < rightIdx){

            if(heights[leftIdx] < heights[rightIdx] ){
                leftIdx++;
                leftMax = Math.max(leftMax, heights[leftIdx]);
                surfaceArea += leftMax - heights[leftIdx];
            }else {
                rightIdx--;
                rightMax = Math.max(rightMax , heights[rightIdx]);
            surfaceArea += rightMax - heights[rightIdx];
            }
        }
        return surfaceArea;
    }

    public static void main(String[] args) {
        int heights[]= {0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3};

        System.out.println("This is the water area : " + waterArea(heights));
    }
}
